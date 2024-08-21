package grid;
import java.util.Scanner;


public class SimulationQ3 {
        public static int[][] arr;
        public static int row;
        public static int col;
        public static int max = 0;

        public static void block1(int x, int y){
            if(x+1 >= row || y+1 >= col){
                return;
            }

            int sum = arr[x][y] + arr[x+1][y] + arr[x][y+1] + arr[x+1][y+1];
            max = Math.max(max, sum - arr[x][y]);
            max = Math.max(max, sum - arr[x+1][y]);
            max = Math.max(max, sum - arr[x][y+1]);
            max = Math.max(max, sum - arr[x+1][y+1]);
        }

        public static void block2(int x, int y){
            if(x+2 >= row || y >= col){
                return;
            }
            int sum = arr[x][y] + arr[x+1][y] + arr[x+2][y];
            max = Math.max(max, sum);
        }

        public static void block3(int x, int y){
            if(x >= row || y+2 >= col){
                return;
            }
            int sum = arr[x][y] + arr[x][y+1] + arr[x][y+2];
            max = Math.max(max, sum);
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // 행렬 크기 받기
            row = sc.nextInt();
            col = sc.nextInt();

            //행렬 채우기
            arr = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    // 3가지 경우 돌리기
                    block1(i, j);
                    block2(i, j);
                    block3(i, j);
                }
            }

            System.out.print(max);
        }
}


// 코드트리 정답
//import java.util.Scanner;
//
//public class Main {
//    public static final int MAX_NUM = 200;
//
//    public static int n, m;
//    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
//
//    // 가능한 모든 모양을 전부 적어줍니다.
//    public static int[][][] shapes = new int[][][]{
//            {{1, 1, 0},
//             {1, 0, 0},
//             {0, 0, 0}},
//
//            {{1, 1, 0},
//             {0, 1, 0},
//             {0, 0, 0}},
//
//            {{1, 0, 0},
//             {1, 1, 0},
//             {0, 0, 0}},
//
//            {{0, 1, 0},
//             {1, 1, 0},
//             {0, 0, 0}},
//
//            {{1, 1, 1},
//             {0, 0, 0},
//             {0, 0, 0}},
//
//            {{1, 0, 0},
//             {1, 0, 0},
//             {1, 0, 0}},
//    };
//
//    // 주어진 위치에 대하여 가능한 모든 모양을 탐색하며 최대 합을 반환합니다.
//    public static int getMaxSum(int x, int y) {
//        int maxSum = 0;
//
//        for(int i = 0; i < 6; i++) {
//            boolean isPossible = true;
//            int sum = 0;
//            for(int dx = 0; dx < 3; dx++)
//                for(int dy = 0; dy < 3; dy++) {
//                    if(shapes[i][dx][dy] == 0) continue;
//                    if(x + dx >= n || y + dy >= m) isPossible = false;
//                    else sum += grid[x + dx][y + dy];
//                }
//
//            if(isPossible)
//                maxSum = Math.max(maxSum, sum);
//        }
//
//        return maxSum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        n = sc.nextInt();
//        m = sc.nextInt();
//
//        for(int i = 0; i < n; i++)
//            for(int j = 0; j < m; j++)
//                grid[i][j] = sc.nextInt();
//
//        int ans = 0;
//
//        // 격자의 각 위치에 대하여 탐색하여줍니다.
//        for(int i = 0; i < n; i++)
//            for(int j = 0; j < m; j++)
//                ans = Math.max(ans, getMaxSum(i, j));
//
//        System.out.print(ans);
//    }
//}






















