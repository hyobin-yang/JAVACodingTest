package TwoPointer;

import java.util.Scanner;


// 핵심은 시간제한 뚫기
// 이중 순회 안 쓰도록

public class Q12891{
    final static int[] minDNA = new int[4];
    static int[] cntDNA = new int[4];
    static char[] DNA;
    static int start = 0;
    static int end;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int p = sc.nextInt();
        DNA = sc.next().toCharArray();
        end = start + p;

        int result = 0;

        // 필요한 유전자 개수의 최솟값 배열 생성
        for (int i=0; i<4; i++){
            minDNA[i] = sc.nextInt(); // 순서대로 ACGT
        }

        // 첫 부분배열 -> 유전자 개수 배열 초기화
        for (int i=0; i<p; i++){
            int idx = checkDNA(DNA[i]);
            cntDNA[idx]++;
        }

        // 첫 부분배열 비밀번호 적합성 검사
        if(checkPW()){result++;}

        // 부분배열 순회
        while(end < s){
            add(DNA[end]);
            remove(DNA[start]);
            if(checkPW()){result++;}; // 비번 적합성 검사
            start++;
            end++;
        }


        System.out.print(result);

    }

    static void add(char ch){
        int idx = checkDNA(ch);
        cntDNA[idx]++;
    }

    static void remove(char ch){
        int idx = checkDNA(ch);
        cntDNA[idx]--;
    }


    static boolean checkPW(){
        for (int i=0; i<4; i++){
            if(cntDNA[i] < minDNA[i]){
                return false;
            }
        }
        return true;
    }


    static int checkDNA(char ch){
        return switch (ch) {
            case 'A' -> 0; // 자바 낮은 버전에서는 컴파일에러
            case 'C' -> 1;
            case 'G' -> 2;
            default -> 3;
        };

    }
}





















