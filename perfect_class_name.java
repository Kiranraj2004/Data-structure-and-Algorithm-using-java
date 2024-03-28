import java.util.HashSet;

public class perfect_class_name {
    public static void main(String[] args) {
        String s="Length of Longest Subarray With at Most K Frequency";
        underscore(s);

    }
    static void underscore(String s){
        String[] answer=s.split(" ");
        System.out.println( String.join("_",answer));
    }
}