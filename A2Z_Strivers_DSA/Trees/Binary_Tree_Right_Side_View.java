package A2Z_Strivers_DSA.Trees;

import java.util.*;

public class Binary_Tree_Right_Side_View {
    public static void main(String[] args) {

    }
//    public static List<Integer> rightSideView(TreeNode root) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        if (root == null) {
//            return ans;
//        }
//        Map<Integer, Integer> mpp = new TreeMap<>();
//        Queue<TreeNode> n=new LinkedList<>();
//        Queue<Integer>i=new LinkedList<>();
//        n.add(root);
//        i.add(0);
//        while(!n.isEmpty()){
//            int index=i.remove();
//            TreeNode temp=n.remove();
//            mpp.put(index,temp.data);
//            if (temp.left!=null){
//                n.add(temp.left);
//                i.add(index+1);
//            }
//            if (temp.right!=null){
//                n.add(temp.right);
//                i.add(index+1);
//            }
//        }
//        ans.addAll(mpp.values());
//        return ans;
//    }
}
