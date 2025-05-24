package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");
        System.out.println("--------------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");
        System.out.println("--------------------");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("--------------------");

        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("--------------------");

        // 세명 까지만 사줄게 (for문 사용)
        for (int i = 0; i < 3; i++) {
            System.out.println(coffees[i] + " 하나");
        }

    }
}
