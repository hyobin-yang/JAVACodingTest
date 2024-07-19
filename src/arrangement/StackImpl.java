package arrangement;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {

        Stack stack = new Stack();

        // 스택이 비어있는지 확인 - boolean
        stack.empty();

        // 객체 저장
        stack.push(1);

        // top 부분의 객체 반환, 삭제하지 않음
        stack.peek();

        // top 부분의 객체 꺼냄
        stack.pop();


    }
}
