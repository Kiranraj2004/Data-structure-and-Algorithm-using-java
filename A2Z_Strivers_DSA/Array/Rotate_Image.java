package A2Z_Strivers_DSA.Array;

public class Rotate_Image {
    public static void main(String[] args) {

    }

//     brute force method

    public void rotate1(int[][] matrix) {
        int n=matrix.length;
        int [][]temp=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                temp[j][n-i-1]=matrix[i][j];
            }
        }
//        matrix=temp; this will gives wrong answer  because we have to do it in place of matrix arr
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                matrix[i][j]=temp[i][j];
            }
        }
    }


//     optimal solution
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix,i);
        }

    }
    public void reverse(int[][]matrix,int row){
        int s=0,e=matrix.length-1;
        while(s<e){
            int temp=matrix[row][e];
            matrix[row][e]=matrix[row][s];
            matrix[row][s]=temp;
            s++;
            e--;
        }

    }
}
