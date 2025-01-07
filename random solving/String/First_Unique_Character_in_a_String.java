package String;

//https://leetcode.com/problems/first-unique-character-in-a-string

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s="leetlcotdcode";
        System.out.println(firstUniqChar(s));
    }
    public  static int firstUniqChar(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0, charArrayLength = charArray.length; i < charArrayLength; i++) {
            char c = charArray[i];
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if (index == lastIndex)
                return index;
        }
        return -1;
    }
}
