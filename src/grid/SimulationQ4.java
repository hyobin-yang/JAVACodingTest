package grid;
import java.util.Scanner;


public class SimulationQ4 {

    public static int n, m;
    public static int[][] grid;

    public static int cost(int k){
        return (k*k) + (k+1)*(k+1);
    }


    public static int getGoldNum(int x, int y, int k){
        int goldNum = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if ( (Math.abs(x-i) + Math.abs(y-j)) <= k){
                    goldNum += grid[i][j];
                }
            }
        }

        return goldNum;

    }



    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 영역 크기
        m = sc.nextInt(); // 금 가격
        grid = new int[n][n]; // 금 분포 배열
        int maxGold = 0;

        // 금 분포 이차원 영역
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        // 모든 점을 중심점으로 하여 순회
        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                for (int k=0; k <= 2*(n-1); k++){
                    int goldNum = getGoldNum(x, y, k);

                    if (goldNum*m >= cost(k)){
                        maxGold = Math.max(maxGold, goldNum);
                    }
                }
            }
        }

        System.out.print(maxGold);


    }
}