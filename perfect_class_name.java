public class perfect_class_name {
    public static void main(String[] args) {
        String s="Minimum Number of Operations to Move All Balls to Each Box";
        underscore(s);
    }
    static void underscore(String s){
        String[] answer=s.split(" ");
        System.out.println( String.join("_",answer));
    }
}