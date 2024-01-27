package Array.Hashing.hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

class ourownhashmap {
    static class Hashmap<k,v>{
        private class node{
            k key;
            v value;
            public node(k key,v value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; // number of nodes
        private int N;//number of buckets
        private LinkedList<node>buckets[];

        public Hashmap() {
            this.N=4;
            this.buckets=new LinkedList[N];
            for (int i = 0; i <N ; i++) {
                this.buckets[i]=new LinkedList<>();
            }
        }
        public void put(k key,v value){
            int bi=hasfunction(key);
            int di=secrch(key,bi);
            if(di==-1){
                buckets[bi].add(new node(key,value));
                n++;
            }
            else{
               node k= buckets[bi].get(di);
               k.value=value;
            }
            double lamda=(double) (n/N);
            if (lamda==2.0){
                reashing(buckets);
            }
        }
        private v get(k key){
            int bi=hasfunction(key);
            int di=secrch(key,bi);
            if(di==-1){
               return null;
            }
            else{
                node k= buckets[bi].get(di);
                return k.value;
            }
        }
        private boolean contaians(k key){
            int bi=hasfunction(key);
            int di=secrch(key,bi);
            return di != -1;
        }
        private v remove(k key){
            int bi=hasfunction(key);
            int di=secrch(key,bi);
            if(di==-1){
                return null;
            }
            else{
                 node a=buckets[bi].remove(di);
                 n--;
                return a.value ;
            }
        }
       private ArrayList<k> getkey(){
            ArrayList<k>res=new ArrayList<>();
           for (int i = 0; i < buckets.length ; i++) {
               for (int j = 0; j <buckets[i].size() ; j++) {
                   node a=buckets[i].get(j);
                   res.add(a.key);
               }

           }
           return res;
       }
        private void reashing(LinkedList<node>[] buckets) {
            LinkedList<node>[] oldnode =buckets;
            buckets= new LinkedList[2*N];
            for (int i = 0; i <buckets.length ; i++) {
                buckets[i]=new LinkedList<>();
            }
            for (int i = 0; i < oldnode.length ; i++) {
                LinkedList<node>ll=oldnode[i];
                for (int j = 0; j <oldnode[i].size() ; j++) {
                    node y=ll.get(i);
                    put(y.key,y.value);
                }
            }
        }
        private int secrch(k key, int bi) {
          LinkedList<node>temp=buckets[bi];
            for (int i = 0; i < temp.size(); i++) {
                if(temp.get(i).key==key){
                    return i;
                }
            }
          return -1;
        }

        private int hasfunction(k key) {
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }
        private boolean isempty(){
            return n==0;
        }
    }


    public static void main(String[] args) {
        Hashmap<String,Integer>map=new Hashmap<>();
        map.put("india",120);
        map.put("china",180);
        map.put("usa",1);
        map.put("india",180);
        System.out.println(map.get("india"));
        System.out.println(map.contaians("chin"));
        System.out.println(map.remove("usa"));
        System.out.println(map.getkey());
        System.out.println(map.isempty());
    }
}

