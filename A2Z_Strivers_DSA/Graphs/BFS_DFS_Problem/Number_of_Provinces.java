package A2Z_Strivers_DSA.Graphs.BFS_DFS_Problem;

public class Number_of_Provinces {
    public static void main(String[] args) {

    }
//    TC(n*n)
//    sc O(N)
    public static  int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        boolean[]visited=new boolean[n];
        int count=0;
        for (int i = 0; i <n ; i++) {
            if (!visited[i]){
                count++;
                helper(isConnected,visited,i);
            }

        }
        return count;
    }

    private static void helper(int[][] isConnected, boolean[] visited, int i) {
        visited[i]=true;
        for (int j = 0; j <isConnected.length ; j++) {
            if (!visited[j]&&isConnected[i][j]==1){
                helper(isConnected,visited,j);
            }
        }
    }
}
