package arrangement_list;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        int result = 0;

        char[] numArr = s.toCharArray();

        for (int c : numArr){
            result += c - '0'; //ASCII code 사용
        }

        System.out.println(result);

    }
}
