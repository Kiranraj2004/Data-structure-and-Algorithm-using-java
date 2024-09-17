package leetcodedailyquestion.september;
import java.util.*;
public class Find_a_Safe_Walk_Through_a_Grid {
    public static void main(String[] args) {
        Find_a_Safe_Walk_Through_a_Grid obj=new Find_a_Safe_Walk_Through_a_Grid();
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 1, 1),
                Arrays.asList(1, 0, 1),
                Arrays.asList(1, 1, 1)
        );
        int health = 5;

        System.out.println(obj.findSafeWalk(grid, health)); // Output: true

    }
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        if(grid.get(0).get(0)==1)health=health-1;
        boolean [][]v=new boolean[grid.size()][grid.get(0).size()];
        v[0][0]=true;
        int [][][]dp=new int [grid.size()][grid.get(0).size()][health+1];
        for (int i = 0; i < grid.size() ; i++) {
            for (int j = 0; j <grid.get(0).size() ; j++) {
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(grid,health,0,0,v,dp);
    }

    private boolean helper(List<List<Integer>> grid, int health, int row, int col,boolean[][]v, int [][][]dp) {
        if(health==0)return false;
        if(row==grid.size()-1&&col==grid.get(0).size()-1&&health>0)return true;
        if(dp[row][col][health]!=-1){
            return dp[row][col][health]== 1;
        }
        int []drow={-1,1,0,0};
        int []dcol={0,0,-1,1};

        for (int i = 0; i <drow.length ; i++) {
            int trow=row+drow[i];
            int tcol=col+dcol[i];
            if(trow>=0&&trow<grid.size()&&tcol>=0&&tcol< grid.get(0).size()&& !v[trow][tcol]){
                v[trow][tcol]=true;
                if(grid.get(trow).get(tcol)==1){
                    if (helper(grid,health-1,trow,tcol,v,dp)){
                        dp[row][col][health]=1;
                        return  true;
                    }
                }
               else if (helper(grid,health,trow,tcol,v,dp)){
                    dp[row][col][health]=1;
                    return true;
                }
                v[trow][tcol]=false;
            }
        }
        dp[row][col][health]=2;
        return false;
    }
}
