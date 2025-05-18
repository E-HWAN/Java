package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2); //4를 2로 나누고 나머지
        System.out.println(5 % 2);

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연산 ++ --

        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 일단 더하고 그다음에 출력
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 일단 문장을 출력 하고 다음에 +1을 함
        System.out.println(val); // 11

        val = 10;
        System.out.println(val);
        System.out.println(--val); // 일단 -1을 하고 출력
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val--); // 일단 출력 후 -1
        System.out.println(val);

        // 은행 대기 번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("총 대기 인원 : " + waiting);
    }
}
