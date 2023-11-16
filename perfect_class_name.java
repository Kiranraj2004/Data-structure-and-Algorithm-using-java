public class perfect_class_name {
    public static void main(String[] args) {
        String s="Convert an Array Into a 2D Array With Conditions\n";
        underscore(s);
    }
    static void underscore(String s){
        String[] answer=s.split(" ");
        System.out.println( String.join("_",answer));
    }
}
