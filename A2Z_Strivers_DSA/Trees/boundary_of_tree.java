package A2Z_Strivers_DSA.Trees;

import java.util.ArrayList;
import java.util.Stack;

public class boundary_of_tree {
    public static void main(String[] args) {

    }

//    public static ArrayList<Integer>boundary(TreeNode root){
//        ArrayList<Integer>res=new ArrayList<>();
//        if (isleaf(root)==false)res.add(root.val);
//        leftboundary(root,res);
//        rightboundary(root,res);
//        leaf(root,res);
//        return res;
//    }
//
//    private static void leaf(TreeNode root, ArrayList<Integer> res) {
//        if (isleaf(root)){
//            res.add(root.data);
//            return;
//        }
//        if(root.left!=null)root.left;
//        if (root.right!=null)root.right;
//    }
//
//    private static void rightboundary(TreeNode root, ArrayList<Integer> res) {
//        TreeNode curr=root.left;
//        Stack<Integer>r=new Stack<>();
//        while (curr!=null){
//            if (!isleaf(curr))r.add(curr.data);
//            if (curr.right!=null)curr.right;
//            else curr.left;
//        }
//        while(r.isEmpty()==false){
//            res.add(r.peek());
//            r.pop();
//        }
//    }
//
//    private static void leftboundary(TreeNode root, ArrayList<Integer> res) {
//        TreeNode curr=root.left;
//        while(curr!=null){
//            if (!isleaf(curr))res.add(curr.root);
//            if (curr.left!=null)curr=curr.left;
//            else curr=curr.right;
//        }
//    }
//
//    private static boolean isleaf(TreeNode root) {
//        return root.left==null&&root.right==null;
//    }
}
