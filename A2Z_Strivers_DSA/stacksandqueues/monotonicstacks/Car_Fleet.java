package A2Z_Strivers_DSA.stacksandqueues.monotonicstacks;
import java.util.Arrays;
import java.util.Stack;

public class Car_Fleet {
    public static void main(String[] args) {
        int target=12;
        int[]position={10,8,0,5,3};
        int[]speed={2,4,1,1,3};
        System.out.println(carFleet(target,position,speed));

    }
//    public static int carFleet(int target, int[] position, int[] speed) {
////        this code is perfect but it going to take lot of time
//        for (int i = 0; i <position.length ; i++) {
//            boolean t=false;
//            for (int j = 1; j <position.length-i ; j++) {
//                if (position[j]<position[j-1]){
//                    int temp=position[j];
//                    position[j]=position[j-1];
//                    position[j-1]=temp;
//                    temp=speed[j];
//                    speed[j]=speed[j-1];
//                    speed[j-1]=temp;
//                    t=true;
//                }
//            }
//            if (!t){
//                break;
//            }
//        }
//        Stack<Float>res=new Stack<>();
//        float time= (float) (target - position[position.length-1]) /speed[speed.length-1];
//        res.push(time);
//        for (int i =position.length-2; i >=0 ; i--) {
//            time= (float) (target - position[i]) /speed[i];
//            if (!res.isEmpty()&&res.peek()<time){
//                     res.push(time);
//            }
//        }
//     return res.size();
//    }
public static int carFleet(int target, int[] position, int[] speed) {
        double[]temp=new double[target];
    for (int i = 0; i <position.length; i++) {
        temp[position[i]]= (double) (target - position[i]) /speed[i];
    }
    Arrays.sort(position);
    System.out.println(Arrays.toString(temp));
    System.out.println(Arrays.toString(position));
    Stack<Double>res=new Stack<>();
        res.push(temp[position[position.length-1]]);
        for (int i =position.length-2; i >=0 ; i--) {
            if (res.peek()<temp[position[i]]){
                     res.push(temp[position[i]]);
            }
        }
     return res.size();
}

}
