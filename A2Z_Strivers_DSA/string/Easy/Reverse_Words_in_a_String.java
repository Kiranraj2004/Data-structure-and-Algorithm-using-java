package A2Z_Strivers_DSA.string.Easy;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        StringBuffer ans=new StringBuffer();
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                i--;
                continue;
            }
            int end=i+1;
            while(i>=0&&s.charAt(i)!=' '){
                i--;
            }
            String word=s.substring(i+1,end);
            if(i<0){
                ans.append(word);
                ans.append(' ');
            }
            else{
                ans.append(word);
            }
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
