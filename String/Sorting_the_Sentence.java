package String;

public class Sorting_the_Sentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }
    public static String sortSentence(String s) {
        String[] a=s.split(" ");
        String[] answer=new String[a.length];

        for (String i :a) {
            int index=(int)(i.charAt(i.length()-1))-'0';
            answer[index-1]=i.substring(0,i.length()-1);
        }

        return String.join(" ",answer);
    }
}
