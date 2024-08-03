package arrangement;

//import java.util.Scanner;
//import java.util.Stack;

//시간초과 남 -> bufferedReader, bufferedWriter, IOException 사용해야 함
//public class Q17298{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int[] numArr = new int[n];
//        Stack<Integer> stack = new Stack<>();
//
//        int[] resultArr = new int[n];
//
//        for (int i = 0; i < n; i++){
//            numArr[i] = sc.nextInt();
//        }
//
//        int idx = n-1;
//
//        while(idx >= 0){
//            if (stack.isEmpty()){
//                resultArr[idx] = -1;
//                stack.push(numArr[idx]);
//                idx--;
//            } else{
//                if (numArr[idx] >= stack.peek()){
//                    stack.pop();
//                } else{
//                    resultArr[idx] = stack.peek();
//                    stack.push(numArr[idx]);
//                    idx--;
//                }
//            }
//        }
//
//        for(int result : resultArr){
//            System.out.print(result + " ");
//        }
//
//    }
//}



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class Q17298{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        int[] numArr = new int[n];
        int[] resultArr = new int[n];

        Stack<Integer> stack = new Stack<>();
        String[] input = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(input[i]);
        }

        int idx = n-1;

        while(idx >= 0){
            if (stack.isEmpty()){
                resultArr[idx] = -1;
                stack.push(numArr[idx]);
                idx--;
            } else{
                if (numArr[idx] >= stack.peek()){
                    stack.pop();
                } else{
                    resultArr[idx] = stack.peek();
                    stack.push(numArr[idx]);
                    idx--;
                }
            }
        }

        for (int result : resultArr) {
            writer.write(result + " ");
        }
        writer.flush();
        writer.close();
        reader.close();

    }
}


