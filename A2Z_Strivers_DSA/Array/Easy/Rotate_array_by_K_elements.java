package A2Z_Strivers_DSA.Array.Easy;

public class Rotate_array_by_K_elements {
    public static void main(String[] args) {

    }
//    brute force method
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int index=0;
        int []temp=new int[nums.length];
        for (int i = nums.length-k; i <nums.length ; i++) {
            temp[index++]=nums[i];
        }
        for (int i = 0; i <nums.length-k ; i++) {
            temp[index++]=nums[i];
        }
        for (int i = 0; i <temp.length ; i++) {
            nums[i]=temp[i];
        }

    }

//     tc O(2N) sc O(N)
// optimal solution
    public void rotate1(int[] nums, int k) {
        int rotate=k%nums.length;
        int index=nums.length-rotate;
        swap(nums,0,index-1);
        swap(nums,index,nums.length-1);
        swap(nums,0,nums.length-1);


    }
    public void swap(int []nums,int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    //     tc O(N) sc O(1)

}
