package leetcodedailyquestion.May2024;

public class Reverse_Prefix_of_Word {
    public static void main(String[] args) {
        String a="abcefd";

        System.out.println(reversePrefix(a,'d'));
    }
    
    public static String reversePrefix(String word, char ch) {
        if (word.indexOf(ch)==-1){
            return word;
        }
        int end=word.indexOf(ch);
        int start=0;
        StringBuffer res=new StringBuffer(word);
        while(start<end){
            char temp=res.charAt(start);
            res.setCharAt(start,res.charAt(end));
            res.setCharAt(end,temp);
            start++;
            end--;
        }
        return res.toString();

    }
}
