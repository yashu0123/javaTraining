package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        List<Integer>l1 = new Vector<>();

        Vector<Integer>l3 = new Vector<>();
        List<Integer>l2 = new ArrayList<>();

       // l1.add(1);
        System.out.println(l3.capacity());

        Thread t1 = new Thread( () ->{
            for(int i =0 ; i< 100 ; i++)
                l2.add(1);
        });
        Thread t2 = new Thread( () ->{
            for(int i =0 ; i< 100 ; i++)
                l2.add(2);
        });

        t1.run();
        t2.run();
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("l1 : " +l1.size());
        System.out.println("l2 : " +l2.size());
        System.out.println("l3 : " +l3.size());

    }
}
