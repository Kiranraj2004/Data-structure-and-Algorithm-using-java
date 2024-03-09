package A2Z_Strivers_DSA.Linklist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;
    }
}
class a {
   public static Node head=null;
    Node tail=null;


    public void insert(int data){
        Node n=new Node(data);
        if (head==null){
            head=tail=n;
            return;
        }
        tail.next=n;
        tail=n;
    }

}

public class Middle_of_the_Linked_List extends a{
    public static void main(String[] args) {
        a obj=new a();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        System.out.println((middleNode(head)).data);
    }
//    public static ListNode middleNode(ListNode head) {
//        ArrayList<ListNode>res=new ArrayList<>();
//        ListNode temp=head;
//        while(temp!=null){
//            res.add(temp);
//            temp=temp.next;
//        }
//        if (res.size()%2==0){
//            return res.get((res.size()/2));
//        }
//        return res.get(res.size()/2);
//    }

//    this is using  Tortoise-Hare-Approach
//Unlike the above approach, we don’t have to maintain node count here and we will be able to find the middle node in a single traversal so this approach is more efficient.
//
//    Intuition: In the Tortoise-Hare approach, we increment slow ptr by 1 and fast ptr by 2, so if take a close look fast ptr will travel
//    double that of the slow pointer. So when the fast ptr will be at the end of the Linked List, slow ptr would have covered half of the Linked List till then. So slow ptr will be pointing towards the middle of Linked List.
//
//    Approach:
//
//    Create two pointers slow and fast and initialize them to a head pointer.
//    Move slow ptr by one step and simultaneously fast ptr by two steps until fast ptr is NULL or next of fast ptr is NULL.
//    When the above condition is met, we can see that the slow ptr is pointing towards the middle of the Linked List and hence we can return the slow pointer.
public  static Node middleNode(Node head) {
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
}
