package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {

        // 조건문 ElseIf
        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongAde = true;
        boolean mangojuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        }
        else if (mangojuice) {
            System.out.println("망고쥬스 +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }




        hallabongAde = false;
        mangojuice = false;
        boolean orangeJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        }
        else if (mangojuice) {
            System.out.println("망고쥬스 +1");
        }
        else if (orangeJuice){
            System.out.println("오랜지쥬스 +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }

        hallabongAde = false;
        mangojuice = false;
        orangeJuice = false;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        }
        else if (mangojuice) {
            System.out.println("망고쥬스 +1");
        }
        else if (orangeJuice){
            System.out.println("오랜지쥬스 +1");
        }

    }
}
