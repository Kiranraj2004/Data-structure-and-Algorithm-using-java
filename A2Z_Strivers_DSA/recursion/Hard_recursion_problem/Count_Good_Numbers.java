package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

public class Count_Good_Numbers {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }
    public static int countGoodNumbers(long n) {
        int []count={1};
      return  helper(0,n,count);
    }

    private static  int helper(int index, long n,int []count) {
        if (index==n){
            return 0;
        }
        if (index%2==0){

            count[0]*=5;
            helper(index+1,n,count);
        }
        else{
           count[0]*=4;
                helper(index+1,n,count);
        }
        return count[0];
    }
}
