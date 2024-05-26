package A2Z_Strivers_DSA.Trees;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Bottom_view_of_a_Binary_Tree {
    public static void main(String[] args) {

    }
    public ArrayList <Integer> bottomView(Node root)
    {
//        ArrayList<Integer>res=new ArrayList<>();
//        HashMap<Integer,ArrayList<Integer>>temp=new HashMap<>();
//        Queue<Node>element=new LinkedList<>();
//        Queue<Integer>col=new LinkedList<>();
//        Queue<Integer>row=new LinkedList<>();
//        HashMap<Integer,Integer>rowfind=new HashMap<>();
//        element.add(root);
//        col.add(0);
//        row.add(0);
//        while(!element.isEmpty()){
//            Node t=element.remove();
//            int c=col.remove();
//            int r=row.remove();
//            ArrayList<Integer>p=new ArrayList<>();
//            if (temp.containsKey(c)){
//                if (rowfind.get(c)==r){
//                  p.addAll(temp.get(c));
//                  p.add(t.data);
//                    temp.put(c,p);
//                }
//                else{
//                    p.add(t.data);
//                    temp.put(c,p);
//                    rowfind.put(c,r);
//                }
//            }
//            else{
//                p.add(t.data);
//                temp.put(c,p);
//                rowfind.put(c,r);
//            }
//            if (t.left!=null){
//                element.add(t.left);
//                col.add(c-1);
//                row.add(r+1);
//            }
//            if (t.right!=null){
//                element.add(t.right);
//                col.add(c+1);
//                row.add(r+1);
//            }
//        }
//        ArrayList<Integer>p=new ArrayList<>(temp.keySet());
//        Collections.sort(p);
//        for(int i:p){
//            for(int j:temp.get(i)){
//                res.add(j);
//            }
//        }
//        return res;
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Node>n=new LinkedList<>();
        Queue<Integer>i=new LinkedList<>();
        n.add(root);
        i.add(0);
        while(!n.isEmpty()){
            int index=i.remove();
            Node temp=n.remove();
            mpp.put(index,temp.data);
            if (temp.left!=null){
                n.add(temp.left);
                i.add(index-1);
            }
            if (temp.right!=null){
                n.add(temp.right);
                i.add(index+1);
            }
        }
        ans.addAll(mpp.values());
        return ans;
    }
}
