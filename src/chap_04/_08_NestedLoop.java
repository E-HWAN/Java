package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {

        // 이중 반복문

        // 별 (*)로 사각형을 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("-----------");

        String star = "*";
        int  starCount = 0;
        int starCount2 = 0;
        while (starCount2 < 5){
            while (starCount<5) {
                System.out.print(star);
                starCount ++;

            }
            System.out.println();
            starCount = 0;
            starCount2 ++;
        }



        // 별 (*) 왼쪽 삼각형 만들기
        System.out.println("-----------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("-----------");


        // 별 (*) 오른쪽 삼각형 만들기
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------");

        // 별 (*) 정삼각형 만들기
        int k = 10;
        for (int i = 1; i <=k ; i++) {
            for (int j = 1; j <= k-i; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

