package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {


    public static void main(String[] args) throws Exception{

        List<Integer> l1 = Arrays.asList(1,2,3,4,5);

        List<Integer>l2 = List.of(1,2,3,4);

        List<Integer> list = new ArrayList<>();
        list.addAll(l2);


        System.out.println(list);

        list.remove(2);
        list.remove(Integer.valueOf(4));
        System.out.println(list);

        List<String> str = new ArrayList<>();

        String[] s1 = {"yash" , "ram" , "sita"};

        System.out.println("s1 = " + s1);
        str.addAll(List.of(s1));


        str.remove("yash");
      //  str.remove(2);
        System.out.println(str);


 //       System.out.println(l1);

        String[] s2 = str.toArray(new String[0]);
        System.out.println("string array " + s2);
    }
}
