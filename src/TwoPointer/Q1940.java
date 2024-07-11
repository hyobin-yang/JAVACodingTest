package TwoPointer;

import java.util.Scanner;

public class Q1940 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = 1;
        int cnt = 0;
        int sum;

        while(start < N-1){

            sum = arr[start] + arr[end];

            if (sum == M){
                cnt ++;
            }
            end++;

            if(end == N){
                start++;
                end = start + 1;
            }
        }



        System.out.print(cnt);

    }
}
