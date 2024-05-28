package A2Z_Strivers_DSA.heaps;

import java.util.ArrayList;

public class minheap {
    ArrayList<Integer>list;

    minheap(){
        list=new ArrayList<>();
    }
    public void insert(int data){
        if (list.isEmpty()){
            list.add(data);
            return;
        }
        list.add(data);
        int count=list.size()-1;
        while(count>0&&list.get(count)<list.get((count-1)/2)){
            swap(count,(count-1)/2);
            count=(count-1)/2;
        }

    }
    public void swap(int f,int s){
        int temp=list.get(f);
        list.set(f,list.get(s));
        list.set(s,temp);
    }
    public int delete  (int index)throws Exception{
        if(index>=list.size()||index<0){
            throw new Exception("index out of bound");
        }
        if (index==list.size()-1){
           return list.remove(index);
        }
        int deletedelement=list.get(index);
        list.set(index,list.remove(list.size()-1));
        int left=index*2+1;
        int right=index*2+2;
        while(left<list.size()){
            if (list.get(left)<list.get(index)){
                swap(left,index);
                index=left;
            }
            else if(right<list.size()&&list.get(right)<list.get(index)){

                    swap(left,index);
                    index=right;
            }
            else{
                return deletedelement;
            }
            left=index*2+1;
            right=index*2+2;
        }
        return deletedelement;
    }

    public static void main (String[] args)throws Exception {
        minheap s=new minheap();
        s.insert(18);
        s.insert(15);
        s.insert(16);
        s.insert(12);
        s.insert(13);
        s.insert(20);
        System.out.println(s.list);
        System.out.println(s.delete(1));
        System.out.println(s.list);
    }

}
