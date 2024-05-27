package A2Z_Strivers_DSA.Trees;
import java.util.*;

public class Symmetric_Tree {
    public static void main(String[] args) {

    }

//    using iterator
//    public boolean isSymmetric(TreeNode root) {
//       Queue<TreeNode>temp=new LinkedList<>();
//       temp.add(root);
//       temp.add(null);
//       ArrayList<Integer>res=new ArrayList<>();
//       while (!temp.isEmpty()){
//           TreeNode node =temp.remove();
//           if (node ==null){
//              if (ispalindrome(res)){
//                  return false;
//              }
//              res=new ArrayList<>();
//              if (temp.isEmpty()){
//                  break;
//              }
//              else{
//                  temp.add(null);
//              }
//           }
//           else {
//               if (node.left!=null){
//                   temp.add(node.left);
//                   res.add(node.left.val);
//               }
//               if (node.left==null){
//                   res.add(101);
//               }
//
//               if (node.right!=null){
//                   temp.add(node.right);
//                   res.add(node.right.val);
//               }
//               if (node.right==null){
//                   res.add(101);
//               }
//           }
//       }
//       return true;
//    }
//
//    private boolean ispalindrome(ArrayList<Integer> res) {
//        int s=0;
//        int e=res.size()-1;
//
//        while(s<e){
//            if (!Objects.equals(res.get(s), res.get(e))){
//                return true;
//            }
//            s++;
//            e--;
//        }
//        return false;
//    }


//    using recursion
//public boolean isSymmetric(TreeNode root) {
//    if (root == null) {
//        return true;
//    }
//    return isMirror(root.left, root.right);
//}
//
//    private boolean isMirror(TreeNode node1, TreeNode node2) {
//        if (node1 == null && node2 == null) {
//            return true;
//        }
//        if (node1 == null || node2 == null) {
//            return false;
//        }
//        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
//    }
}
