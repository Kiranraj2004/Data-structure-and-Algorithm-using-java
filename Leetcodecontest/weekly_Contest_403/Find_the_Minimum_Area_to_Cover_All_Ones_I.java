package Leetcodecontest.weekly_Contest_403;

public class Find_the_Minimum_Area_to_Cover_All_Ones_I {
    public static void main(String[] args) {
        int [][]m={{0,1,0},
                {0,0,0}};
        System.out.println(minimumArea(m));

    }
    public static  int minimumArea(int[][] grid) {
        int maxw=Integer.MIN_VALUE;
        int minw=Integer.MAX_VALUE;
        int maxh=Integer.MIN_VALUE;
        int minh=Integer.MAX_VALUE;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j]==1){
                    if (i<minh){
                        minh=i;
                    }
                    if (i>maxh){
                        maxh=i;
                    }
                    if (j<minw){
                        minw=j;
                    }
                    if (j>maxw){
                        maxw=j;
                    }
                }

            }

        }
        int sum=((maxh-minh)+1)*((maxw-minw)+1);
        return sum;
    }
}
