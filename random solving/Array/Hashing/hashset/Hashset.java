package Array.Hashing.hashset;
import java.util.HashSet;
import java.util.Iterator;
// implementation of hashing and understanding about iterator
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set.contains(3));
        System.out.println(set.size());
        System.out.println(set.remove(6));
        System.out.println(set);
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println( it.next());
        }
    }
}
