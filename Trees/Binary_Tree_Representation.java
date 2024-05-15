package Trees;
import java.util.*;
public class Binary_Tree_Representation {
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
    public static void main(String[] args) {
      int[]arr={1,2,3,4,5,6,7};
      ArrayList<Integer>v=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            v.add(arr[i]);
        }
        Node root0=new Node(v.get(0));
      createTree(root0,v);
      levelorder(root0);

    }
    public static void createTree(Node root0, ArrayList<Integer> v ){
        // Code here
        int i=1;
        Queue<Node>res=new LinkedList<>();
        res.add(root0);
        while(i<v.size()){
            Node temp=res.remove();
            if (i<v.size()){
                Node a=new Node(v.get(i));
                temp.left=a;
                res.add(a);
                i++;
            }
            if (i<v.size()){
                Node a=new Node(v.get(i));
                temp.right=a;
                res.add(a);
                i++;
            }
        }

    }
}
