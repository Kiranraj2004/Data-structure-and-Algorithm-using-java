package A2Z_Strivers_DSA.dynamic_programing.dp_strings;
public class Longest_Common_Substring {
    public static void main(String[] args) {
        Longest_Common_Substring obj=new Longest_Common_Substring();
        System.out.println(obj.longestCommonSubstr( "ABCDGH", "ACDGHR"));

    }

    public int longestCommonSubstr(String str1, String str2) {
        // code here
        int [][]dp=new int[str1.length()+1][str2.length()+1];
        int ans=0;
        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<dp.length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                }

            }
        }
//        for(int[]row:dp){
//            System.out.println(Arrays.toString(row));
//        }

        return ans;


//         space optimization which takes O(N)
//        int []dp=new int[str2.length()+1];
//        int ans=0;
//        for(int i=1;i<=str1.length();i++){
//            int []curr=new int[str2.length()+1];
//            for(int j=1;j<dp.length;j++){
//                if(str1.charAt(i-1)==str2.charAt(j-1)){
//                    curr[j]=1+dp[j-1];
//                    ans=Math.max(ans,curr[j]);
//                }
//
//            }
//            dp=curr;
//        }
//
//        return ans;

    }
}
