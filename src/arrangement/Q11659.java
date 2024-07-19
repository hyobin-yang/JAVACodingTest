package arrangement;

import java.util.Scanner;

public class Q11659 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] sArr = new int[n+1];

        for (int i=1; i<=n; i++){
            sArr[i] = sArr[i-1] + sc.nextInt();
        }

        int[] results = new int[q];

        for (int i=0; i<q; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            results[i] = sArr[end] - sArr[start-1];
        }

        for (int result : results){
            System.out.println(result);
        }

    }
}