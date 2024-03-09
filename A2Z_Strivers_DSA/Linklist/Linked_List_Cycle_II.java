package A2Z_Strivers_DSA.Linklist;
import java.util.*;
public class Linked_List_Cycle_II {
    public static void main(String[] args) {

    }
    public static Node detectCycle(Node head) {
    HashSet<Node> res =new HashSet<>();
    Node temp=head;
    while (temp!=null){
        if(res.contains(temp)){
            return temp;
        }
        res.add(temp);
        temp=temp.next;
    }
    return null;
//        Use this example:
//        Fast and slow pointers meet at 6 and cycle starts at 4
//
//        1-->2-->3-->4-->5-->6-->7-->8-->9-->Back to 4
//
//        I<-----x----->I<---y--->I<-------z------->|
//
//        Let x be the distance from the head to the start of the cycle at 4
//        y is the distance from the start of the cycle to the intersection point of fast and slow pointers i.e at 6
//        z is the distance from the intersection till the start of the cycle at 4
//
//        Distance travelled by slow pointer = x + y
//        Distance travelled by fast pointer = x + y + z + y = x + 2y + z (and not directly 2x + 2y as is written in all the solutions. I never understood how people are directly writing it as 2x + 2y when the x distance is not travelled by fast pointer twice)
//
//        We know Speed = Distance / Time so Time = Distance / Speed
//        Considering constant Time and equating LHS to RHS
//        Time taken by slow == Time taken by fast
//        Distance / Speed == Distance / Speed
//        Sine fast pointer runs at double speed
//        Slow speed = 1 , fast speed = 2
//        x+y / 1 = (x + 2y + z )/ 2
//        Cross Multiply
//
//        2x + 2y = x + 2y + z
//        x = z
//        Distance from head to start of cycle = Distance from meeting point of slow and fast to the start of cycle
//    this is using tortoise and hare algorithm
//        ListNode slow=head;
//        ListNode fast;
//        fast=head;
//        while(fast!=null&&fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast){ListNode entry=head;
//                while(entry!=slow){
//                    entry=entry.next;
//                    slow=slow.next;
//                }
//                return entry;
//            }
//        }
//        return null;
    }
}
