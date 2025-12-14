package Collections;

import java.util.Arrays;
import java.util.Stack;

public class stack_demo {

    public static void main(String[] args) {

        Stack<Integer>stack = new Stack<>();

        stack.add(2);
        stack.add(3);
        stack.push(44);
        stack.addAll(Arrays.asList(2,3,4,5,6));
        System.out.println(stack);
        System.out.println(stack.search(44));
        while (!stack.empty()){

            System.out.println(stack.peek());
            Integer pop = stack.pop();

        }

    }
}
