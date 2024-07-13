# 투포인터 문제
### 2개의 포인터로 알고리즘의 시간 복잡도를 최적화한다
### 일반적으로 배열이나 리스트가 '정렬되어 있을 때' 사용된다
### 왼쪽 포인터, 오른쪽 포인터 -> 탐색 범위의 시작점, 끝점
### 탐색 범위 내에서 특정 조건을 만족하는 요소를 찾거나, 조건을 만족하는 부분 배열의 길이 등을 계산할 때 사용
### 선형탐색
### O(N)시간에 풀 수 있도록 코드 짜야함


## 시간복잡도
- O(N)
- 즉 배열이나 리스트의 크기에 비례하여 알고리즘의 수행시간이 증가

## 종류

1. 고정 길이 슬라이딩 윈도우
   - 고정된 길이의 윈도우를 사용하여 배열이나 리스트를 탐색
   - 윈도우의 크기를 일정하게 유지하면서 두 포인터를 이동시키며 필요한 계산 수행
   - 부분 배열의 합이나 평균 계산에 사용

2. 가변 길이 슬라이딩 윈도우
   - 윈도우의 크기를 필요에 따라 변경하면서 두 포인터를 이동시킨다
   - 최소 길이 부분 배열이나 최대 길이 부분 배열을 찾는 등의 문제에 사용

3. 두 포인터의 합과 차
   - 두 포인터를 사용하여 합이나 차를 계산


## 덱
- 자바에서의 Deque은 인터페이스로 구현되어 있음
- ArrayDeque, LinkedBlockingDeque, ConcurrentLinkedDeque, LinkedList 등의 클래스 존재

1. 생성
   - Deque<자료형> deque = new LinkedList<>(); 
   - LinkedList 자리에 필요한 클래스 넣기

2. 메서드 사용
   - deque.addFirst(); // 덱 앞쪽에 데이터 삽입, 용량 초과시 Exception
   - deque.offerFirst(); // 덱 앞쪽에 데이터를 삽입 후 true 반환, 용량 초과 시 false
   
   - deque.addLast(); // 덱 뒤쪽에 데이터 삽입, 용량 초과 시 Exception
   - deque.add(); // addLast와 동일
   - deque.offerLast();
   - deque.offer(); //offerLast와 동일

   - deque.removeFirst(); // 덱의 앞에서 제거, 비어있으면 예외
   - deque.remove(); // removeFirst()와 동일
   - deque.poll(); // 덱의 앞에서 제거, 비어있으면 null 리턴
   - deque.pollFirst(); // poll()과 동일

   - deque.removeLast(); // 덱의 뒤에서 제거, 비어있으면 예외
   - deque.pollLast(); // 덱의 뒤에서 제거, 비어있으면 null 리턴

   - deque.push(); // addFirst()와 동일
   - deque.pop(); // removeFirst()와 동일

   - deque.getFirst(); // 첫 번째 값 확인, 비어있으면 예외
   - deque.peekFirst(); // 첫 번째 값 확인, 비어있으면 null
   - deque.peek(); // peekFirst()와 동일

   - deque.getLast(); // 마지막 값 확인, 비어있으면 예외
   - deque.peekLast(); // 마지막 값 확인, 비어있으면 null

   - deque.contain(Object o); // Object 인자와 동일한 엘리먼트 포함되어 있는지 확인
   - deque.size(); // 덱에 들어있는 엘리먼트 개수


















