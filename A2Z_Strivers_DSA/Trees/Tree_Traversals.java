package A2Z_Strivers_DSA.Trees;
import java.util.*;
public class Tree_Traversals {
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
        int[]arr={1, 2, 3 ,-1 ,-1 ,-1,  6 ,-1 ,-1};
        Node root=createnode(arr);
        System.out.println( getTreeTraversal(root));
    }
    private static void  inorder(Node root,List<Integer>res) {
        if (root==null)return;
        inorder(root.left,res);
        res.add(root.data);
        inorder(root.right,res);
    }
    public static void preorder(Node root,List<Integer>res){
        if (root==null)return;
        res.add(root.data);
        preorder(root.left,res);
        preorder(root.right,res);
    }
    public static void postorder(Node root,List<Integer>res){
        if (root==null)return;
        preorder(root.left,res);
        preorder(root.right,res);
        res.add(root.data);
    }
    public static List<List<Integer>> getTreeTraversal(Node root) {
        // Write your code here.
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        inorder(root,a);
        res.add(a);
        a=new ArrayList<>();
        preorder(root,a);
        res.add(a);
        a=new ArrayList<>();
        postorder(root,a);
        res.add(a);
      return res;
    }
}
