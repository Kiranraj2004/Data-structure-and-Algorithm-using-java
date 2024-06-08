package A2Z_Strivers_DSA.binary_search_tree;
import A2Z_Strivers_DSA.Node;

import java.util.PriorityQueue;

public class Ceil_in_BST {
    public static void main(String[] args) {

    }
//    this is using heaps
//    int findCeil(Node root, int key) {
//        if (root == null) return -1;
//        // Code here
//        PriorityQueue<Integer>temp=new PriorityQueue<>();
//        while(root!=null){
//            if (root.data>key)temp.add(root.data);
//            if (root.data==key){
//                return key;
//            }
//            else if(root.data>key){
//                root=root.left;
//            }
//            else{
//                root=root.right;
//            }
//        }
//        if (temp.isEmpty())return -1;
//        return temp.peek();
//    }
//    this is using the temp variable
//    int findCeil(Node root, int key) {
//        if (root == null) return -1;
//        // Code here
//        int c=-1;
//        while(root!=null){
//            if (root.data==key){
//                return key;
//            }
//            else if(root.data>key){
//                c=root.data;
//                root=root.left;
//            }
//            else{
//                root=root.right;
//            }
//        }
//        return c;
//    }
}
