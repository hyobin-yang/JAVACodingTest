package arrangement;

import java.util.Scanner;

public class Q11660 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[][] prefix_matrix = new int[n+1][n+1];

        for (int i=1; i<=n; i++){
            //int prefix = 0;
            for (int j=1; j<=n; j++){
                prefix_matrix[i][j] = prefix_matrix[i][j-1] + sc.nextInt();
            }
        }


        for (int i=0; i<q; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int result = 0;

            for (int j=x1; j<=x2; j++){
                result += (prefix_matrix[j][y2] - prefix_matrix[j][y1-1]);
            }

            System.out.println(result);
        }


    }
}
