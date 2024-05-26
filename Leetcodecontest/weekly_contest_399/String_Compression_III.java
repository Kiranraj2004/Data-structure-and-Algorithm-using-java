package Leetcodecontest.weekly_contest_399;

public class String_Compression_III {
    public static void main(String[] args) {
        String f = "aaaaaaaaaaaaaaaa";
        System.out.println(compressedString(f));
    }

    public static String compressedString(String word) {
        StringBuffer ans = new StringBuffer();
        int i = 0;
        int j;
        while (i < word.length()) {
            j = i + 1;
            while (j < word.length()&&word.charAt(j) == word.charAt(i)) {
                j++;
            }
                int count = j- i;
                if (count <= 9) {
                    ans.append((char) (count + 48));
                    ans.append(word.charAt(i));

                } else {
                    while (count != 0) {
                        if (count > 9) {
                            ans.append((char) (9 + 48));
                            ans.append(word.charAt(i));
                            count -= 9;
                        } else {
                            ans.append((char) (count + 48));
                            ans.append(word.charAt(i));
                            count = 0;
                        }
                    }
                }
            i =j;
        }

        return ans.toString();
    }
}
