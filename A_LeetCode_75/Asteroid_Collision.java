package A_LeetCode_75;
import java.util.Arrays;
import java.util.Stack;

public class Asteroid_Collision {
    public static void main(String[] args) {
        int[]a={10,2,-15};
        System.out.println(Arrays.toString(asteroidCollision(a)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>res=new Stack<>();
        for (int i = 0; i <asteroids.length ; i++) {
           if (res.isEmpty() || asteroids[i]>0){
               res.push(asteroids[i]);
           }
           else{
               while (true){
                   int top= res.peek();
                   if (top<0){
                       res.push(asteroids[i]);
                       break;
                   }
                   int abs=Math.abs(asteroids[i]);
                   if(top==abs){
                       res.pop();
                       break;
                   }
                   else if(top>abs){
                       break;
                   }
                   else{
                       res.pop();
                       if (res.isEmpty()){
                           res.push(asteroids[i]);
                           break;
                       }
                   }
               }
           }
         }
        int []k=new int[res.size()];
        for (int i = 0; i < res.size() ; i++) {
            k[i]=res.get(i);
        }
        return k;
    }
}
