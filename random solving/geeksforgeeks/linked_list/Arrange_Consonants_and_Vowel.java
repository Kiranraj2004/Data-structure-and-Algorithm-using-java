package geeksforgeeks.linked_list;
class Node{
    char data;
    Node next;

    public Node(char c) {

    }
}
public class Arrange_Consonants_and_Vowel {
    public static void main(String[] args) {

    }
    public static Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
       Node con=new Node('0');
       Node cpointer=null;
       Node vow=new Node('1');
       Node vpointer=null;
       Node temp=head;
        String s="AEIOUaeiou";
        while(temp!=null){
            if (s.indexOf(temp.data)!=-1){
                if (vpointer==null){
                    vow.next=temp;
                    vpointer=temp;
                }
                else{
                    vpointer.next=temp;
                    vpointer=vpointer.next;
                }
            }
            else{
                if (cpointer==null){
                    con.next=temp;
                    cpointer=temp;
                }
                else{
                    cpointer.next=temp;
                    cpointer=cpointer.next;

                }
            }
            temp=temp.next;
        }
        if (cpointer==null&&vpointer!=null) {
            vpointer.next = null;
            return vow.next;
        }
        if (cpointer!=null)
            cpointer.next = null;
        if (vpointer==null&&cpointer!=null){
            return con.next;
        }
        if (vpointer!=null)
             vpointer.next=con.next;

        return vow.next;
    }
}
