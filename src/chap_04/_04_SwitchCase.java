package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {

        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 같은 경우에는 여러 조건 또는 범위에 해당하는경우
        int ranking = 4; // 1등
        if (ranking == 1) {
            System.out.println("전액 장학금");
        }
        else if (ranking == 2) {
            System.out.println("반액 장학금");
        }
        else if (ranking == 3) {
            System.out.println("반액 장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");

        // Switch Case 문을 이용
        // Switch Case 명확한 케이스가 있는 경우
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3 :
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }

        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: //2,3등일때 합치기. break 를 안쓰고 공백 처리
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 4;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
            break;
        }
        System.out.println(grade + "제품의 가격 : " + price + "원 입니다.");

        String fruit = "banana";

        switch(fruit) {
            case "banana":
                System.out.println("바나나 입니다.");
            break;

            case "*orange":
                System.out.println("오랜지 입니다.");
            break;

            case "apple":
                System.out.println("사과 입니다.");
            break;
        }

    }
}
