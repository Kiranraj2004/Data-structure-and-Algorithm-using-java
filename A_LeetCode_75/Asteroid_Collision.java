package A_LeetCode_75;


import java.util.Stack;

public class Asteroid_Collision {
    public static void main(String[] args) {
        int[]a={10,10,-5};
        System.out.println(asteroidCollision(a));
    }
    public static Stack<Integer> asteroidCollision(int[] asteroids) {
        Stack<Integer>res=new Stack<>();
        res.push(asteroids[0]);
        for (int i = 1; i <asteroids.length ; i++) {
            if (asteroids[i]>0&&res.peek()>0||asteroids[i]<0&&res.peek()<0){
                res.push(asteroids[i]);
            }
            else{
                int n=asteroids[i];
                int peek=res.peek();
                boolean q=false;
                while (res.size()>1){
                    if (Math.abs(peek)>Math.abs(n)){
                        break;
                    }
                    else if(Math.abs(peek)==Math.abs(n)){
                        res.pop();
                        break;
                    }
                    else{
                        res.pop();
                        if (q){
                            res.pop();
                        }
                        if (res.size()>0){
                        peek= res.peek();
                        }
                        res.push(n);
                        q=true;
                    }
                }
                return res;
            }
        }
        return res;
    }
}
