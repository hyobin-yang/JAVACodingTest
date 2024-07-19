package arrangement;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {

        // 큐는 인터페이스만 있고 별도의 클래스는 없음 -> 큐 인터페이스를 구현한 클래스를 활용해야
        // 즉 LinkedList는 큐 인터페이스의 구현체
        Queue<Integer> queue = new LinkedList<Integer>();

        // 큐에 데이터 삽입, 성공하면 true, 저장공간이 부족하면 IllegalstateException
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // 큐에 데이터 삽입, 성공하면 true 실패하면 false
        queue.offer(0);

        // 삭제없이 객체 읽어오기, 큐가 비어있으면 null 반환
        queue.peek();

        // 큐에서 객체를 꺼내서 반환, 비어있으면 null
        queue.poll();

        // 큐에서 객체를 꺼내서 반환, 비어있으면 NoSuchElementException
        queue.remove();


    }
}
