import java.util.HashSet;

public class perfect_class_name {
    public static void main(String[] args) {
        String s="Count Subarrays Where Max Element Appears at Least K Times";
        underscore(s);

    }
    static void underscore(String s){
        String[] answer=s.split(" ");
        System.out.println( String.join("_",answer));
    }
}