package A2Z_Strivers_DSA.Array;
import java.util.Arrays;
public class Merge_Sorted_Array {
    public static void main(String[] args) {

    }
//     brute force method
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0,j=m;i<n;j++){
            nums1[j]=nums2[i];
            i++;
        }
        Arrays.sort(nums1);
    }
//     TC O((N+M)(log(N+M))) sc O(1)

//     optimal solution
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=nums1.length-1;
        int i=m-1;
        int j=n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
    //     TC O(M+N) sc O(1)
}
