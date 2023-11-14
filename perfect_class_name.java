public class perfect_class_name {
    public static void main(String[] args) {
        String s="Reverse Words in a String III";
        underscore(s);
    }
    static void underscore(String s){
        String[] answer=s.split(" ");
        System.out.println( String.join("_",answer));
    }
}
