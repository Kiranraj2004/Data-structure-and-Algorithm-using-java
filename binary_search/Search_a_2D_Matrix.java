package binary_search;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][]matrix={
                {1}
        };
        System.out.println(searchMatrix(matrix,2));
    }
    public  static boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int fix=0;
        int end=matrix.length-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if (matrix[mid][fix]==target){
                return true;
            }
            else if(matrix[mid][fix]>target){
                end=mid-1;
            }else{

                start=mid+1;
            }
        }
        if (end==-1)return false;
        fix=end;
        start=0;
        end=matrix[fix].length-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if (matrix[fix][mid]==target){
                return true;
            }else if(matrix[fix][mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    return false;
//         this give the optimal solution
//        int m = matrix.length, n = matrix[0].length;
//        int left = 0, right = m * n - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            int r = mid / n, c = mid % n;
//            if (matrix[r][c] == target) {
//                return true;
//            } else if (matrix[r][c] > target) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return false;
    }
}
