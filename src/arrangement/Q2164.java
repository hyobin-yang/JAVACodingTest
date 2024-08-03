package arrangement;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Q2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i=1; i<=n; i++){
            deque.add(i);
        }

        while(deque.size() > 1){
            deque.pop();
            deque.add(deque.pop());
        }

        System.out.print(deque.pop());
    }
}
