package Array;

public class Maximun_jump {
    public static void main(String[] args) {
        int[]arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr){
        int jumps=0;
        int i=0;
        while(i<arr.length){
            jumps++;
            if (arr[i]==0)return -1;
            i+=arr[i];
            if (i>=arr.length-1)return jumps;
        }
        return -1;
    }
}
