package Array.Hashing.hashmap;
//first question on hashmap
import java.util.HashMap;

public class Ransom_Note {
    public static void main(String[] args) {
        String ra="aab";
        String mag="baa";
        System.out.println(canConstruct(ra,mag));
    }
    public  static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>temp=new HashMap<>();
        for (int i = 0; i <magazine.length() ; i++) {
            if(temp.containsKey(magazine.charAt(i))){
                temp.put( magazine.charAt(i),temp.get(magazine.charAt(i))+1);
            }else{
                temp.put( magazine.charAt(i),1);
            }

        }
        for (int i = 0; i <ransomNote.length() ; i++) {
            if(temp.containsKey(ransomNote.charAt(i))){
                temp.put( ransomNote.charAt(i),temp.get(ransomNote.charAt(i))-1);
                if(temp.get(ransomNote.charAt(i))==0){
                    temp.remove(ransomNote.charAt(i));
                }
            }
            else{
                return false;
            }

        }
        return true;
    }
}
