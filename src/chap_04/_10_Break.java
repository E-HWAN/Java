package chap_04;

public class _10_Break {
    public static void main(String[] args) {

        // Break
        // 치킨집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
        // 손님이 50명 대기

        int max = 20;
        for (int i = 1; i <=50 ; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }

        }
        System.out.println("영업을 종료합니다.");

        System.out.println("--------------");

        int index = 1; //대기손님 번호
        while (index <= 50){
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다.");

            if (index == 20){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            index +=1;
        }
        System.out.println("영업을 종료합니다.");
    }
}
