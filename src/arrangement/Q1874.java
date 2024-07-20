package arrangement;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();

        int n = sc.nextInt();
        boolean canMake = true;
        for (int i=0; i<n; i++){
            int a = sc.nextInt();
            deque.add(a);
        }

        int i=1;
        StringBuilder result = new StringBuilder();

        while(true){

            if (stack.isEmpty()){
                stack.add(i);
                result.append("+\n");
                i++;
            }

            if (Objects.equals(deque.getFirst(), stack.getLast())){
                stack.removeLast();
                deque.pop();
                result.append("-\n");
            } else if (deque.getFirst() < stack.getLast()){
                canMake = false;
                break;
            } else{
                stack.add(i);
                result.append("+\n");
                i++;
            }

            if (stack.isEmpty() && deque.isEmpty()){
                break;
            }

        }

        if (canMake) {
            System.out.println(result);
        } else {
            System.out.println("NO");
        }

    }
}
