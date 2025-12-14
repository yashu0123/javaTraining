package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();

        l1.add(2);
        l1.add(5);
        l1.add(10);
        l1.add(8);
       // l1.removeIf(x->x%2==0);
        Integer[] arr = {2,3,49,5};
   //     List<Integer> l2 = Arrays.asList(arr);
        //l1.addAll(Arrays.asList(arr));
        l1.addFirst(15);
        l1.addLast(20);
        l1.add(23);
//        Collections.sort(l1);

        System.out.println(l1);
    }
}
