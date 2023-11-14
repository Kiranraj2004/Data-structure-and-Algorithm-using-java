package String;
//https://leetcode.com/problems/robot-return-to-origin
public class Robot_Return_to_Origin {
    public static void main(String[] args) {
        String moves="RLL";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
     int a=0,b=0;
        for (int i = 0; i <moves.length() ; i++) {
            switch (moves.charAt(i)) {
                case 'R' -> a++;
                case 'L' -> a--;
                case 'U' -> b--;
                case 'D' -> b--;
            }
        }
        return a==0&&b==0;
    }
}
