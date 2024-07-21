package Leetcodecontest.weekly_contest_407;

public class Number_of_Bit_Changes_to_Make_Two_Integers_Equal {
    public static void main(String[] args) {
        System.out.println(minChanges(14,14));
    }
    public static  int minChanges(int n, int k) {
        int count=0;
        int j=1;
        for(int i=0;i<31;i++){
            int n1=(n&j);
            int k1=(k&j);
            if(n1==0&&k1!=0){
                return -1;
            }
            if(n1!=0&&k1==0){
                count++;
            }
            j=j<<1;
        }
        return count;

    }
}
