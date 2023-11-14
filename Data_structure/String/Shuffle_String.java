package String;
//https://leetcode.com/problems/shuffle-string
public class Shuffle_String {
    public static void main(String[] args) {
        String s="codeleet";
        int[]indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));

    }
    public  static String restoreString(String s, int[] indices) {
        char[] answer=new char[indices.length];
        for (int i = 0; i <indices.length ; i++) {
            answer[indices[i]]=s.charAt(i);
        }
        return String.valueOf(answer);
    }
}
