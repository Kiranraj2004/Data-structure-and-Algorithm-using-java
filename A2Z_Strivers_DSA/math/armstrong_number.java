package A2Z_Strivers_DSA.math;

public class armstrong_number {
    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
    public static boolean armstrong(int nums){
        int[]arr=new int[10];
        int i=0;
        int n=nums;
        while(nums!=0){
            arr[i++]=nums%10;
            nums/=10;
        }
        long sum=0;
        for (int j = 0; j <i ; j++) {
            sum+=Math.pow(arr[j],i);
        }
        System.out.println(sum);
        return sum==n;
    }
}
