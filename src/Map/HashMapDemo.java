package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"ram");
        map.put(3,"yash");
        map.put(4,"yy");

        System.out.println(map);
        System.out.println(map.containsValue("yash"));
        System.out.println(map.get(4));
        for (Integer i : map.keySet()) {
            System.out.println(i +" : " + map.get(i));

        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> x : entries) {

            System.out.println(x.getKey() + " : " + x.getValue());

        }
        System.out.println(map.size());

    }
}
