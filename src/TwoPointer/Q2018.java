package TwoPointer;

import java.util.Scanner;

public class Q2018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int start = 1;
        int end = start + 1;

        int sum = start;
        int cnt = 0;

        while(true){

            if (start == N){
                cnt ++;
                break;
            }

            sum += end;

            if(sum < N){
                end++;
            } else if (sum == N){
                cnt++;
                start++;
                end = start + 1;
                sum = start;
            } else{
                start++;
                end = start + 1;
                sum = start;
            }
        }

        System.out.print(cnt);
    }
}
