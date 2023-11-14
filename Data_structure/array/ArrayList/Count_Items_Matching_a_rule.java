package ArrayList;
import java.util.List;
//https://leetcode.com/problems/count-items-matching-a-rule
public class Count_Items_Matching_a_rule {
    public static void main(String[] args) {
     List<List<String>>items=List.of(List.of("phone","silver","pixel"),List.of("computer","silver","lenovo"),
             List.of("phone","gold","silver"));
        String rulekey="color";
        String ruleValue="silver";
        System.out.println(countMatches(items,rulekey,ruleValue));

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int index = switch (ruleKey) {
            case "color" -> 1;
            case "type" -> 0;
            case "name" -> 2;
            default -> 0;
        };
//
        for (int i = 0; i < items.size() ; i++) {
            if (items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
   return count;
    }
}
