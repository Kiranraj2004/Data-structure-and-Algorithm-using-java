package A2Z_Strivers_DSA.binary_search_tree;

import A2Z_Strivers_DSA.Node;

import java.util.ArrayList;

public class Largest_BST {
    public static void main(String[] args) {

    }
//    static int largestBst(Node root)
//    {
//        // Write your code here
//        int count=0;
//        ArrayList<Integer>res=new ArrayList<>();
//        helper(root,res);
//        int i=0;
//        while(i<res.size()){
//            int next=i+1;
//            while(next<res.size()&&res.get(next-1)<= res.get(next)){
//                next+=1;
//            }
//            count=Math.max(count,next);
//            i++;
//
//        }
//        return count;
//    }
//   static  private void helper(Node root, ArrayList<Integer> res) {
//        if (root==null){
//            return;
//        }
//        helper(root.left,res);
//        res.add(root.data);
//        helper(root.right,res);
//    }
}
