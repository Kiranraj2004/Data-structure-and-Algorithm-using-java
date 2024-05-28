package A2Z_Strivers_DSA.heaps;

import java.util.ArrayList;

public class Heaps <T extends Comparable<T>>{
    private ArrayList<T>list;
    public Heaps() {
        list=new ArrayList<>();
    }
    public int parent(int i){
        return (i-1)/2;
    }
    public int left(int i){
        return(i*2)+1;
    }
    public int right(int i){
        return(i*2)+2;
    }
    public void swap(int f,int s){
        T temp=list.get(f);
        list.set(f,list.get(s));
        list.set(s,temp);
    }

    public void insert(T val){
        list.add(val);
        downsort(list.size()-1);
    }

    private void downsort(int i) {
        if (i==0){
            return;
        }
        int p=parent(i);
        if (list.get(p).compareTo(list.get(i))>0){
            swap(p,i);
            downsort(p);
        }
    }
    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("heap is empty");
        }
        T temp=list.get(0);
        T last=list.remove(list.size()-1);
        if (!list.isEmpty()){
            list.set(0,last);
            upsort(0);
        }
        return temp;
    }

    private void upsort(int i) {
        int min =i;
        int left=left(i);
        int right=right(i);
        if (left<list.size()&&list.get(min).compareTo(list.get(left))>0){
            min =left;
        }
        if (right<list.size()&&list.get(min).compareTo(list.get(right))>0){
            min =right;
        }
        if (min!=i){
            swap(min,i);
            upsort(min);
        }
    }

}
