package leetcodedailyquestion.august2024;
import java.util.*;
public class Minimum_Number_of_Pushes_to_Type_Word_II {
    public static void main(String[] args) {
        String t="aabbccddeeffgghhiiiiii";
        System.out.println(minimumPushes(t));


    }
    public static  int minimumPushes(String word) {
        int []frequence=new int[26];
        for(int i=0;i<word.length();i++){
            int index=(int)(word.charAt(i)-'a');
            frequence[index]++;
        }
        Arrays.sort(frequence);
        int count=0;
        int press=1;

        int i=frequence.length-1;
        while(i>=0){
            int j=1;
            while(j<9&&i>=0){
                count+=(frequence[i]*press);
                i--;
                j++;
            }
            press++;
        }
        return count;

    }
}
