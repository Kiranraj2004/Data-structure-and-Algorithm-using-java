package A2Z_Strivers_DSA.binary_search_tree;

import A2Z_Strivers_DSA.TreeNode;

public class Delete_Node_in_a_BST {
    public static void main(String[] args) {

    }
//    public TreeNode deleteNode(TreeNode root, int key) {
//        if (root==null)return root;
//        if (root.val==key){
//            return helper(root);
//        }
//        TreeNode current=root;
//        while(current!=null){
//            if (current.val>key){
//                if (current.left!=null&&current.left.val==key){
//                    current.left=helper(current.left);
//                }
//                else{
//                    current=current.left;
//                }
//            }
//            else{
//                if(current.right!=null&&current.right.val==key){
//                    current.right=helper(current.right);
//                    break;
//                }
//                else{
//                    current=current.right;
//                }
//            }
//        }
//            return root;
//    }
//
//    private  TreeNode helper(TreeNode root) {
//       if (root.left==null){
//           return root.right;
//       }
//       if (root.right==null){
//           return root.left;
//       }
//       TreeNode rightchild=root.right;
//       TreeNode maxofleft=max(root.left);
//       maxofleft.right=rightchild;
//       return root.left;
//    }
//    private  TreeNode helper2(TreeNode root) {
//        if (root.left==null){
//            return root.right;
//        }
//        if (root.right==null){
//            return root.left;
//        }
//        TreeNode leftchild=root.left;
//        TreeNode mininright=max2(root.right);
//        maxofleft.left=leftchild;
//        return root.right;
//    }
//
//    private TreeNode max2(TreeNode right) {
//        if (right.left==null)
//            return right;
//        return max2(right.left);
//    }
//
//    private TreeNode max(TreeNode left) {
//        if (left.right==null){
//            return left;
//        }
//        return helper(left.right);
//    }

}
