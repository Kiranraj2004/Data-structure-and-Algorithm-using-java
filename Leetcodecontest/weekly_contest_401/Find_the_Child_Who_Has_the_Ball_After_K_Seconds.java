package Leetcodecontest.weekly_contest_401;

public class Find_the_Child_Who_Has_the_Ball_After_K_Seconds {
    public static void main(String[] args) {
        System.out.println(numberOfChild(5,2));
    }
    public static int numberOfChild(int n, int k) {
        int r=k/(n-1);
        int rem=k%(n-1);
        if(r%2==0){
            return rem;

        }
        return (n-1)-rem;
    }
}
