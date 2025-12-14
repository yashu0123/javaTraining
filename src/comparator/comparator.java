package comparator;

import java.util.*;
import java.util.function.Predicate;

//class stringlength implements Comparator<String>{
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o2.length()-o1.length();
//    }
//}
//class intdecre implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2-o1;
//    }
//}

public class comparator {

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();

        str = Arrays.asList("mangokkk" , "apple" , "banana");

        String str1 = str.toString();
        //str.sort( (a,b) -> a.length()-b.length()) ;

        str.sort(null);

        System.out.println(str1);
        List<Integer> l1 = Arrays.asList(3,2,8,6,4,9);

        Comparator<Integer> f1 = (a,b) ->a-b;

        l1.sort(f1.reversed());

        Predicate<Integer> f2 = (a) -> a%2==0;

        System.out.println(l1);

        System.out.println(f2.test(4));





    }


    }

