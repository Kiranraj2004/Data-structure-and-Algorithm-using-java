package A2Z_Strivers_DSA.binary_search_tree;

import A2Z_Strivers_DSA.TreeNode;

public class Construct_Binary_Search_Tree_from_Preorder_Traversal {
    public static void main(String[] args) {

    }
//    public TreeNode bstFromPreorder(int[] preorder) {
//        TreeNode root=new TreeNode(preorder[0]);
//        for (int i = 1; i <preorder.length ; i++) {
//            TreeNode temp=helper(preorder[i],root);
//            TreeNode newnode=new TreeNode(preorder[i]);
//            if (temp.val>preorder[i]){
//                temp.left=newnode;
//            }
//            else{
//                temp.right=newnode;
//            }
//        }
//        return root;
//    }
//
//    private TreeNode helper(int i, TreeNode root) {
//        if (root.val>i){
//            if (root.left==null){
//                return root;
//            }
//                return helper(i,root.left);
//
//        }
//        if (root.right==null){
//            return root;
//        }
//        return helper(i,root.right);
//    }
}
