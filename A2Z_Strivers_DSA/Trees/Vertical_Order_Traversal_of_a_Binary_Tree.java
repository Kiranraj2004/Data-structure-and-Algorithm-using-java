package A2Z_Strivers_DSA.Trees;

import java.util.*;

public class Vertical_Order_Traversal_of_a_Binary_Tree {
    public static void main(String[] args) {

    }
//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//        List<List<Integer>>res=new ArrayList<>();
//        HashMap<Integer,ArrayList<Integer>>temp=new HashMap<>();
//        Queue<TreeNode>element=new LinkedList<>();
//        Queue<Integer>col=new LinkedList<>();
//        Queue<Integer>row=new LinkedList<>();
//        HashMap<Integer,Integer>rowfind=new HashMap<>();
//        element.add(root);
//        col.add(0);
//        row.add(0);
//        while(!element.isEmpty()){
//            TreeNode node=element.remove();
//            int c=col.remove();
//            int r=row.remove();
//            ArrayList<Integer>p=new ArrayList<>();
//            if (temp.containsKey(c)){
//                if (rowfind.get(c)==r){
//                  p.addAll(temp.get(c));
//                 if (p.get(p.size()-1)>node.val){
//                     int a=p.remove(p.size()-1);
//                     p.add(node.val);
//                     p.add(a);
//                     temp.put(c,p);
//                     rowfind.put(c,r);
//                 }
//                 else{
//                     p.add(node.val);
//                     temp.put(c,p);
//                     rowfind.put(c,r);
//                 }
//                }
//                else{
//                   p.addAll(temp.get(c));
//                   p.add(node.val);
//                    temp.put(c,p);
//                    rowfind.put(c,r);
//                }
//            }
//            else{
//                p.add(node.val);
//                temp.put(c,p);
//                rowfind.put(c,r);
//            }
//
//            if (node.left!=null){
//                element.add(node.left);
//                col.add(c-1);
//                row.add(r+1);
//            }
//            if (node.right!=null){
//                element.add(node.right);
//                col.add(c+1);
//                row.add(r+1);
//            }
//        }
//        ArrayList<Integer>sort= new ArrayList<Integer> (temp.keySet());
//        Collections.sort(sort);
//
//        for(int i:sort){
//            res.add(temp.get(i));
//        }
//        return res;
//    }

}
