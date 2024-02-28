package A_LeetCode_75;
import java.util.Arrays;
import java.util.Stack;

public class Asteroid_Collision {
    public static void main(String[] args) {
        int[]a={10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(a)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>res=new Stack<>();
        for (int i = 0; i <asteroids.length ; i++) {
            if (res.isEmpty()){
                res.push(asteroids[i]);
            }
            else if ((asteroids[i]>0&&res.peek()>0)||(asteroids[i]<0&&res.peek()<0)){
                res.push(asteroids[i]);
            }
            else {
                int n = asteroids[i];
                int peek = res.peek();
                boolean q = false;
                while (res.size() >=1) {
                    if (Math.abs(peek) > Math.abs(n)&&((asteroids[i]>0&&res.peek()>0)||(asteroids[i]<0&&res.peek()<0)) ){
                        break;
                    } else if (Math.abs(peek) == Math.abs(n)) {
                        res.pop();
                        break;
                    } else {
                        res.pop();
                        if (q) {
                            res.pop();
                        }
                        if (res.size() > 0) {
                            peek = res.peek();
                        }
                        res.push(n);
                        q = true;
                    }
                }
            }
            }
         if (!res.empty()){
             int[]r=new int[res.size()];
             for (int i = 0; i < res.size() ; i++) {
                 r[i]=res.get(i);
             }
             return r;
         }
        return new int[0];
    }
}
