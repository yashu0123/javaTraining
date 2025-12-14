package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {

        List<Integer>list3 = new CopyOnWriteArrayList<>();

        List<Integer>list1 = new ArrayList<>();

        Vector<Integer>list = new Vector<>();

      // list1.addAll(Arrays.asList(1,2,3,4,5,6));;
        list.addAll(Arrays.asList(1,2,3,4,5,6));;

        //System.out.println("s: "+ list + " s1 " +list1);
        for (Integer x : list)
        {
            System.out.println(x + " :  " + list);
            if(x%2==0)
                list.add(10);
            else
                list.remove(x);
        }
        System.out.println(list);
    }
}
