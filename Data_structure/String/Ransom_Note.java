package String;
//https://leetcode.com/problems/ransom-note

public class Ransom_Note {
    public static void main(String[] args) {
        String ransom="a";
        String magazine="aab";
        System.out.println(canConstruct(ransom,magazine));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()>magazine.length())return false;
        StringBuilder name= new StringBuilder(ransomNote);
        StringBuilder name2=new StringBuilder(magazine);
        int count=0;
        for (int i = 0; i <name.length() ; i++) {
           int num= name2.indexOf(String.valueOf(name.charAt(i)));
           if (num!=-1){
               name2.deleteCharAt(num);
               count++;
           }
        }

        return count==name.length();

    }
}
