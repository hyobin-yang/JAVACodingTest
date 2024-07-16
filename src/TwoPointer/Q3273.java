package TwoPointer;
import java.util.Scanner;


public class Q3273 {
     public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int x = sc.nextInt();
            int[] xArr = new int[x];

            for (int num : arr){
                if (num < x){
                    xArr[num] ++;
                }
            }


            int start = 1;
            int end = x-1;
            int result = 0;

            while(!(start>=end)){
                int cnt = xArr[start] * xArr[end];
                result += cnt;
                start++;
                end--;
            }

            System.out.print(result);


        }

}
