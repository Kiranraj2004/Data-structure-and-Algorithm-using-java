package A2Z_Strivers_DSA.Linklist;
import java.util.*;
public class Linked_List_Cycle_II {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head) {
    HashSet<ListNode> res =new HashSet<>();
    ListNode temp=head;
    while (temp!=null){
        if(res.contains(temp)){
            return temp;
        }
        res.add(temp);
        temp=temp.next;
    }
    return null;
    }
}
