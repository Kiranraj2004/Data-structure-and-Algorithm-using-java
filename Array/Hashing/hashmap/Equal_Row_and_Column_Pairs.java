package Array.Hashing.hashmap;

public class Equal_Row_and_Column_Pairs {
    public static void main(String[] args) {
        int[][]grid={{3,2,1},
                {1,7,6},
                {2,7,7}};
        System.out.println(equalPairs(grid));
    }
    public static int equalPairs(int[][] grid) {
       int count=0;
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid.length ; j++) {
                int index=0;
                for (int k = 0; k < grid.length ; k++) {
                    if (grid[i][k]==grid[k][j]){
                        index++;
                    }
                    else {
                        break;
                    }
                }
                if (index% grid.length==0&&index!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
