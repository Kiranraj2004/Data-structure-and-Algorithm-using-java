package String;
//https://leetcode.com/problems/excel-sheet-column-title/
public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
       int column=28;
        System.out.println(convertToTitle(column));
    }
    public  static String convertToTitle(int columnNumber) {
         StringBuilder answer=new StringBuilder();
        while(columnNumber!=0){
            char a=(char)((columnNumber-1)%26+65);
            answer.append(a);
            columnNumber=(columnNumber-1)/26;

        }
        answer.reverse();
      return answer.toString();
    }
}
