package arrangement;

import java.util.ArrayDeque;
import java.util.Deque;

public class prac {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.add(1);
        stack.add(2);

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

    }
}
