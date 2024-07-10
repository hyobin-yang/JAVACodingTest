package javaBasic;

public class typeCasting {
    public static void main(String[] args) {

        // String형 -> 숫자형
        String sNum = "1234";

        int i1 = Integer.parseInt(sNum);
        int i2 = Integer.valueOf(sNum);

        double d1 = Double.parseDouble(sNum);
        double d2 = Double.valueOf(sNum);

        float f1 = Float.parseFloat(sNum);
        float f2 = Float.valueOf(sNum);


        // parseInt
        // 결과 = 기본primitive 자료형(문자열을 정수로 반환)
        // null값 가질 수 없음

        // valueOf
        // 결과 = 참조 타입 Integer 객체(문자열을 Integer 객체로 변환->기본 int 타입으로 변환)
        // 즉 Integer.parseInt(String), null값 가질 수 있음
        // 메서드 사용 가능, ex) 정수값을 문자열로 변환하는 toString()


        // 숫자형 -> String형
        int i = 1234;
        String s1 = String.valueOf(i);
        String s2 = Integer.toString(i);

        double d = 1.23; //15자리 8byte
        String s3 = String.valueOf(d);
        String s4 = Double.toString(d);

        float f = (float) 1.23; //7자리 4byte
        String f3 = String.valueOf(f);
        String f4 = Float.toString(f);

        // char to int
        // ASCII code 사용
        char c1 = '1';
        int n = c1 - '0';
        System.out.println(n);
        // 아스키 코드 표에서 문자 0~9는 48~57의 순서이므로
        // 문자 1의 아스키 코드에서 문자 0의 아스키 코드를 빼주면 변환 가능
        // '0' = 48, '1' = 49
        // => '1' - '0' = 49 - 48

    }
}
