import java.util.HashSet;

public class perfect_class_name {
    public static void main(String[] args) {
        String s="Minimum Operations to Make Binary Array Elements Equal to One I";
        underscore(s);

    }
    static void underscore(String s){
        String[] answer=s.split(" ");
        System.out.println( String.join("_",answer));
    }
}