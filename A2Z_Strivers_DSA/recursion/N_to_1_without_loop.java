package A2Z_Strivers_DSA.recursion;

public class N_to_1_without_loop {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(printNos(5)));
//       printnto1(1,4);
        print1ton(4);
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int []arr=new int[x];
        helper(x,arr,0);
        return arr;
    }
    public static void helper(int x,int[]arr,int i){
        if (x==0){
            return;
        }
        arr[i]=x;
        helper(x-1,arr,i+1);
    }

//    print backtracking method printing from n to 1
    public static void printnto1(int i,int n){
        if(i>n){
            return;
        }
        printnto1(i+1,n);
        System.out.print(i+" ");
    }

//    printing from 1 to n  using backtracking
    public static void print1ton(int n){
        if (n<1){
            return;
        }
        print1ton(n-1);
        System.out.print(n+" ");
    }
}
