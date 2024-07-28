package leetcodedailyquestion.july2024;

public class Minimum_Cost_to_Convert_String_I {
    public static void main(String[] args) {

    }
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long [][]temp=new long[26][26];
        int n = temp.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    temp[i][j] =(long) 1e9;
                if (i == j) temp[i][j] = 0;
            }
        }
        int max=0;
        for (int i = 0; i <original.length ; i++) {
            int u=original[i]-'a';
            int v=changed[i]-'a';
            temp[u][v]=cost[i];
            max=Math.max(max,u);
        }
        helper(temp,max);
        long ans=0;
        for (int i = 0; i <source.length() ; i++) {
            if (source.charAt(i)==target.charAt(i)){
                int u=source.charAt(i)-'a';
                int v=target.charAt(i)-'a';
                if (temp[u][v]==(1e9))return -1;
                ans+=temp[u][v];
            }
        }
        return ans;
    }

    private void helper(long[][] matrix, int max) {
        int n=matrix.length;
        for (int k = 0; k < max; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Math.min(matrix[i][j],
                            matrix[i][k] + matrix[k][j]);
                }
            }
        }
    }


}
