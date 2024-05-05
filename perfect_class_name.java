import java.util.HashSet;

public class perfect_class_name {
    public static void main(String[] args) {
        String s="Minimum Number of Operations to Make Word K-Periodic";
        underscore(s);

    }
    static void underscore(String s){
        String[] answer=s.split(" ");
        System.out.println( String.join("_",answer));
    }
}