package Trees;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal {
    public static void main(String[] args) {

    }
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>>res=new ArrayList<>();
//        if (root==null)return res;
//        List<Integer>a=new ArrayList<>();
//        Queue<TreeNode>q=new LinkedList<TreeNode>();
//        q.add(root);
//        q.add(null);
//        while(!q.isEmpty()){
//            TreeNode temp=q.remove();
//            if (temp==null){
//                res.add(a);
//                a=new ArrayList<>();
//                if (!q.isEmpty())q.add(null);
//            }
//            else{
//                a.add(temp.val);
//                if (temp.left!=null)q.add(temp.left);
//                if (temp.right!=null)q.add(temp.right);
//            }
//        }
//        return res;
//
//    }
}
