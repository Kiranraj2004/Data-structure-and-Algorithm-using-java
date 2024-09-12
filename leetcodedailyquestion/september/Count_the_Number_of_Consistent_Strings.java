package leetcodedailyquestion.september;

public class Count_the_Number_of_Consistent_Strings {
    public static void main(String[] args) {

    }
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word :words){
            boolean isallowed=true;
            for(char i:word.toCharArray()){
                if(allowed.indexOf(i)==-1){
                    isallowed=false;
                    break;
                }
            }
            if(isallowed){
                count++;

            }
        }
        return count;

    }
}
