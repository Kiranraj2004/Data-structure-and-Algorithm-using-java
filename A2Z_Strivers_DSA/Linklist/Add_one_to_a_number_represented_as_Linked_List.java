package A2Z_Strivers_DSA.Linklist;

import java.util.Stack;

public class Add_one_to_a_number_represented_as_Linked_List {
    public static void main(String[] args) {

    }
    public static Node addOne(Node head) {
        // Write your code here.
        Node temp=head;
        Stack<Node>res=new Stack<>();
        while(temp!=null){
            res.add(temp);
            temp=temp.next;
        }
        while(!res.isEmpty()){
            if(res.peek().data<9){
                res.peek().data+=1;
                return head;
            }
            res.peek().data=0;
            res.pop();
        }
        Node n=new Node(1);
        n.next=head;
        return n;
    }
    public static int helper(Node head){
        if(head==null){
            return 1;
        }
        int carry=helper(head.next);
        head.data+=carry;

        if(head.data==10){
            head.data=0;
            return 1;
        }
        else{
            return 0;
        }
    }
    public static Node addOneusingrecursion(Node head) {
        // Write your code here.
        int carry=helper(head);
        if(carry==1){
            Node a=new Node(1);
            a.next=head;
            return a;
        }
        return head;

    }

}
