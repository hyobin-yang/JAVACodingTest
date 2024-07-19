package arrangement;

import java.util.Scanner;

public class Q10986{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] S = new long[n];
        long[] C = new long[m];

        long cnt = 0;

        S[0] = sc.nextInt();
        for (int i=1; i< n; i++){
            S[i] = S[i-1] + sc.nextInt();
        }


        for (int i=0; i<n; i++){
            int tmp = (int)(S[i] % m);
            if (tmp == 0){
                cnt ++;
            }
            C[tmp]++;
        }

        for (int i=0; i<m; i++){
            if(C[i] > 1){
                cnt += ((C[i] * (C[i]-1)) / 2);
            }
        }

        System.out.print(cnt);

    }
}


// 나머지의 특성 생각하기
// - 나머지끼리의 덧셈 -> 또다른 나머지 유추 가능
// - 나머지의 범위 생각



//시간초과
//public class Q10986 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int[] S = new int[n+1];
//
//        for (int i=1; i<=n; i++){
//            S[i] = S[i-1] + sc.nextInt();
//        }
//
//        여기서 시간초과
//        int cnt = 0;
//        for (int i=1; i<=n; i++){
//            for (int j=0; j<i; j++){
//                if ((S[i] - S[j]) % m == 0){
//                    cnt ++;
//                }
//            }
//        }
//
//        System.out.print(cnt);
//
//    }
//}
