package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>(15,1, true);

        linkedHashMap.put(1,"a");
        linkedHashMap.put(2,"ab");
        linkedHashMap.put(5,"ae");
        linkedHashMap.put(3,"aee");

        linkedHashMap.get(5);
        Set<Map.Entry<Integer, String>> set = linkedHashMap.entrySet();

        for(Map.Entry<Integer, String> x : set )
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
        HashMap<String,Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

    }
}
