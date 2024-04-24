import java.util.HashSet;

public class perfect_class_name {
    public static void main(String[] args) {
        String s="Delete all occurrences of a given key in a doubly linked list";
        underscore(s);

    }
    static void underscore(String s){
        String[] answer=s.split(" ");
        System.out.println( String.join("_",answer));
    }
}