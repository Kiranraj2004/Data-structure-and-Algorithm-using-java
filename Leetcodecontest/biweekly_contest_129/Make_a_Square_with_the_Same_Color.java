package Leetcodecontest.biweekly_contest_129;

public class Make_a_Square_with_the_Same_Color {
    public static void main(String[] args) {

        char[][]grid={{'b','b','b'},
                {'b','w','b'},
                {'b','b','b'}};

        System.out.println(canMakeSquare(grid));

    }
    public static boolean canMakeSquare(char[][] grid) {
            int a=0;
            if(grid[1][0]==grid[1][1])a++;
            if(grid[0][0]==grid[1][1])a++;
            if(grid[0][1]==grid[1][1])a++;
            if(a==2||a==0||a==3){
                return true;
            }

        a=0;
            if(grid[1][2]==grid[1][1])a++;
            if(grid[0][2]==grid[1][1])a++;
            if(grid[0][1]==grid[1][1])a++;
            if(a==2||a==0||a==3){
                return true;
            }

       a=0;
            if(grid[1][0]==grid[1][1])a++;
            if(grid[2][0]==grid[1][1])a++;
            if(grid[2][1]==grid[1][1])a++;
            if(a==2||a==0||a==3){
                return true;
            }

         a=0;
            if(grid[1][2]==grid[1][1])a++;
            if(grid[2][2]==grid[1][1])a++;
            if(grid[2][1]==grid[1][1])a++;
            if(a==2||a==0||a==3){
                return true;
            }

     return false;
    }
}
