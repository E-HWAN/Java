package chap_04;

public class _01_If {
    public static void main(String[] args) {

        // 조건문 If
        int hour = 10; // 오전 10시
        hour = 15;

        // If문 내에서 하나의 문장을 실행할 때는 {} 생략 가능
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");

        // If문 내에서 두개 이상의 문장을 실행 할 때에는 {} 생략 불가
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }


        // 오후 2시 이전이면서 모닝커피를 마시지 않은 경우만 주문
        hour = 10;
        boolean mornigcoffee = false; // 모닝 커피
        // if (hour < 14 && mornigcoffee == false) {
        if (hour < 14 && !mornigcoffee) {
            System.out.println("아이스 아메리카노 +1");
        }

        // 오후 2시 이거나 모닝 커피를 마신 경우?

        hour = 15;
        mornigcoffee = true;
        //if (hour >= 14 || mornigcoffee == true) {
        if (hour >= 14 || !mornigcoffee) {
            System.out.println("아이스 아메리카노 +1(디카페인)");

        }
    }
}
//