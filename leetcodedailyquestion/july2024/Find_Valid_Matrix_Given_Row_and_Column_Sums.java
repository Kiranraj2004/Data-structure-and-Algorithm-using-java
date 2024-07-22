package leetcodedailyquestion.july2024;

//20/7/2024
public class Find_Valid_Matrix_Given_Row_and_Column_Sums {
    public static void main(String[] args) {

    }
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r=rowSum.length;
        int c=colSum.length;
        int [][]res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int min=Math.min(rowSum[i],colSum[j]);
                res[i][j]=min;
                rowSum[i]-=min;
                colSum[j]-=min;
            }
        }
        return res;
    }
}
