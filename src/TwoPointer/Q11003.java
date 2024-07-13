package TwoPointer;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11003{
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        Deque<Node> deque = new LinkedList<>();

        for (int i=0; i<n; i++){

            int now = Integer.parseInt(st.nextToken());

            while(!deque.isEmpty() && deque.getLast().value > now){
                deque.removeLast();
            }

            deque.add(new Node(i, now));

            if (deque.getFirst().index <= i - l){
                deque.removeFirst();
            }

            bw.write(deque.getFirst().value + " ");

        }
        bw.flush();
        bw.close();

    }

    static class Node{
        public int index;
        public int value;

        Node(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
}
