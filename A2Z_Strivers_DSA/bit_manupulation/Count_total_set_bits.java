package A2Z_Strivers_DSA.bit_manupulation;

import java.util.ArrayList;

public class Count_total_set_bits {
    public static void main(String[] args) {
        System.out.println(countSetBitson(7));
    }
    public static int countSetBits(int n) {
        //Write your code here
        int count=0;
        for (int i = 1; i<=n ; i++) {
            int s=i;
//            this is brute force method where we divide the number and take reminder pf that number

//            while(s!=0){
//                if(s%2==1){
//                    count++;
//                }
//                s=s/2;
//            }
//            this is using right shift operator which moves one step forward and divide by 2
//            it will take number of set and non set bit in number
//            while(s!=0){
//                count+=s&1;
//                s=s>>1;
//            }
//            here every time we will do & with its n-1 number in every time each bit is going to deduce
//            it will take number of set bit in a number this is better approch to find number of set bit in number2
//           [Kernighan’s bit count algorithm]
//            https://takeuforward.org/data-structure/count-total-set-bits-in-numbers-from-0-to-n/
            while(s!=0){
                s=s&(s-1);
                count++;
            }
        }
        return count;
    }
    public static int countSetBitson(int n){
        int []arr=new int[n+1];
        int count=0;
        for (int i = 1; i <=n ; i++) {
            arr[i]=arr[i/2]+i%2;
            count+=arr[i];
        }
        return count;
    }
}
