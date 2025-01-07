package Array.Hashing.hashmap;
import java.util.*;
public class inbuilthashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("india",120);
        map.put("china",150);
        map.put("usa",5);
        System.out.println(map);
        System.out.println( map.containsKey("india"));
        map.put("india",180);
//        if we put the same key but different value it update the original value
        System.out.println(map);
//        iteration through the values
        for (Map.Entry<String,Integer>e:map.entrySet()) {
            System.out.print(e.getKey());
            System.out.print(e.getValue()+"\n");
        }
//        another type is using ketset it will give the all the key value;
        for(String h: map.keySet()){
            System.out.print(h);
            System.out.print(map.get(h)+"\n");
        }
        map.remove("china");
        int n = 10;
        // convert n to binary

        // print the binary string
        System.out.println( Integer.toBinaryString(n));
    }
}
