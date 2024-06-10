package A2Z_Strivers_DSA.binary_search_tree;

import java.util.ArrayList;

public class Validate_Binary_Search_Tree {
    public static void main(String[] args) {

    }
//     this is using extra space
//    public static  boolean isValidBST(TreeNode root) {
//        ArrayList<Integer>res=new ArrayList<>();
//        helper(root,res);
//        for (int i = 1; i < res.size() ; i++) {
//            if (res.get(i-1)>res.get(i)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static void helper(TreeNode root, ArrayList<Integer> res) {
//        if (root==null){
//            return;
//        }
//        helper(root.left,res);
//        res.add(root.val);
//        helper(root.right,res);
//    }

//    this is using without extra space
//public boolean isValidBST(TreeNode root) {
//    if(root == null){
//        return false;
//    }
//    return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
//}
//
//    public boolean isValid(TreeNode root, long min, long max){
//        if(root == null){
//            return true;
//        }
//
//        if(root.val <= min || root.val >= max){
//            return false;
//        }
//
//        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
//    }
}
