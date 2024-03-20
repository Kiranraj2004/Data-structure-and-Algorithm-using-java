package A2Z_Strivers_DSA.bit_manupulation;

public class Set_The_Rightmost_Unset_Bit {
    public static void main(String[] args) {
        System.out.println(setBits(5));
    }
    public static int setBits(int N){
        // Write your code here.

//        this is a brute force method which take O(n) to calculate the index of that non set bit

//        int count=0;
//        int i=N;
//        while(i!=0){
//            if((i&1)==0)break;
//            i=i>>1;
//            count++;
//        }
//        if(i==0)return N;
//        return (N|(1<<count));
//        we can use N|(N+1) example 101=5
//                                   110=6 or of this
//                                   111

//        this is optimal solution
//        example 7 =111  if we do N+1&N if we get the zero than return N or
//        return N|(N+1)
//             7= 111
//        7+1=8 =1000 if we do and we get zero
//        example 2 5= 101
//        5+1=6        110 and
//                      100 here we dont get 0 so you should return N|N+1
        if ((N&(N+1))==0) {
            return N;
        }
        return N|(N+1);
    }
}
