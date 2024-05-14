package Trees;

import java.util.*;

public class levelordertraverse {
    static int index=-1;
    public static Node createnode(int []arr){
        index++;
        if (index>=arr.length){
            return null;
        }
        if (arr[index]==-1)return null;
        Node s=new Node(arr[index]);
        s.left=createnode(arr);
        s.right=createnode(arr);
        return s;
    }
    public static void main(String[] args) {
        int[]arr={1,2,-1,-1,4,5,-1,6,7,8,-1};
        Node root=createnode(arr);
        levelorder(root);
    }

    private static void levelorder(Node root) {
        if (root==null)return;
       Queue<Node>r=new LinkedList<>();
       r.add(root);
       r.add(null);
       while (!r.isEmpty()){
           Node temp=r.remove();
           if (temp==null){
               System.out.println();
               if (r.isEmpty()){
                   break;
               }
               else{
                   r.add(null);
               }
           }
           else{
               System.out.print(temp.data+" ");
               if (temp.left!=null){
                   r.add(temp.left);
               }if(temp.right!=null)r.add(temp.right);
           }
       }
    }
}
