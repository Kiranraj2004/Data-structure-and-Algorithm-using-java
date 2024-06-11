package A2Z_Strivers_DSA.binary_search_tree;

import A2Z_Strivers_DSA.TreeNode;

import java.util.HashMap;
import java.util.Stack;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public static void main(String[] args) {

    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        HashMap<Integer,TreeNode>res=new HashMap<>();
//        Stack<Integer>temp=new Stack<>();
//        helper(root,p,res);
//        helper2(root,q,temp);
//        while(!temp.isEmpty()){
//            int s=temp.pop();
//            if (res.containsKey(s)){
//                return res.get(s);
//            }
//        }
//        return null;
//    }
//
//    private void helper2(TreeNode root, TreeNode q, Stack<Integer> temp) {
//        if(root.val==p.val){
//            temp.add(root.val);
//            return;
//        }
//        else if (root.val>q.val){
//            temp.add(root.val);
//            helper2(root.left,q,temp);
//        }
//        else{
//            temp.add(root.val);
//            helper(root.right,q,temp);
//        }
//    }
//
//    private void helper(TreeNode root, TreeNode p, HashMap<Integer, TreeNode> res) {
//        if(root.val==p.val){
//            res.put(root.val,root);
//            return;
//        }
//        else if (root.val>p.val){
//            res.put(root.val,root);
//            helper(root.left,p,res);
//        }
//        else{
//            res.put(root.val,root);
//            helper(root.right,p,res);
//        }
//    }
}

