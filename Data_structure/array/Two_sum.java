//This is a code for adding two number
//ex: [2,7,11,15] ,target=9
//explination: 2+7=9
//output:[0,1] index of 2&7
import java.util.Arrays;
public class Two_sum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        int []answer=new int[1];
         answer=solution(array,target);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution (int[]array,int target){

        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (target==array[i]+array[j]){
              return new int[]{i,j};
                }

            }

        }
return new int[]{};
    }
}


