package A2Z_Strivers_DSA.binary_search_tree;

public class Binary_Search_Trees {
    public static void main(String[] args) {
        int []arr={5, 6, 1, 8, 7};
        System.out.println(isBSTTraversal(arr));
    }
    static boolean isBSTTraversal(int nums[]) {
        for (int i = 1; i <nums.length-1 ; i++) {
            if (nums[i-1]>nums[i]||nums[i+1]<nums[i]){
                return false;
            }
        }
        return true;

    }
}
