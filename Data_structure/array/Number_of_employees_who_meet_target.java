package array;
//https://leetcode.com/problems/number-of-employees-who-met-the-target/
public class Number_of_employees_who_meet_target {
    public static void main(String[] args) {


        int[] arr = {0, 1, 2, 3, 4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(arr,target));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
       int answer=0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i]>=target){
                answer+=1;
            }

        }
        return answer;

    }
}
