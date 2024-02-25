package Leetcodecontest;

public class magic_array {
    public static void main(String[] args) {
        int[]nums={1,2,4,3};
        System.out.println(isMagicArray(1,nums));
    }
    public static boolean isMagicArray(int n, int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0&&arr[i+1]%2==0){
                return  false;
            }
            else if(arr[i]%2==1&&arr[i+1]%2==1){
                return  false;
            }
        }
        return true;
    }
}
