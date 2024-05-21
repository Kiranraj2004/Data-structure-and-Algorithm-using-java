package A2Z_Strivers_DSA.Trees;

import java.util.*;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
    public static void main(String[] args) {

    }
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>>res=new ArrayList<>();
//        if (root==null)return res;
//        Queue<TreeNode>r=new LinkedList<TreeNode>();
//        r.add(root);
//        r.add(null);
//        List<Integer>a=new ArrayList<>();
//        boolean f=false;
//        while (!r.isEmpty()){
//            TreeNode temp=r.remove();
//            if (temp==null){
//                if (f==false){
//                    res.add(a);
//                    f=true;
//                }
//                else{
//                    Collections.reverse(a);
//                    res.add(a);
//                    f=false;
//                }
//                a=new ArrayList<>();
//                if (r.isEmpty()){
//                    break;
//                }
//                else{
//                    r.add(null);
//                }
//            }
//            else{
//                a.add(temp.val);
//                if (temp.left!=null){
//                    r.add(temp.left);
//                }if(temp.right!=null)r.add(temp.right);
//            }
//        }
//        return res;

//    }
}
