package A2Z_Strivers_DSA.string.Easy;

public class Longest_Common_Prefix {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
        StringBuffer prefix=new StringBuffer(strs[0]);
        for(int i=1;i<strs.length;i++){
            String b=strs[i];
            int ai=0;
            int bi=0;
            while(ai<prefix.length()&&bi<b.length()){
                if(prefix.charAt(ai)==b.charAt(bi)){
                    ai++;
                    bi++;
                }
                else{
                    if(ai==0)return "";
                    break;
                }
            }
            prefix.delete(ai + 1, prefix.length());
        }
        return prefix.toString();
    }
}
