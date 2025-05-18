package chap_01;

public class _03_Variables {
     public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name +  "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + " 입니다.");

        boolean pass = false;
        System.out.println("이번시험에 합격 했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

        /* int      (4바이트, -2,147,483,648 ~ 2,147,483,647, 정수 표현, 기본값 0)
           long     (8바이트, -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807, 더 큰 정수 표현, 기본값 0L)
           float    (4바이트, 약 소수점 이하 7자리 정밀도, 실수 표현, 기본값 0.0f)
           double   (8바이트, 약 소수점 이하 15자리 정밀도, 정밀한 실수 표현, 기본값 0.0)
           char     (2바이트, 하나의 문자 표현, 유니코드 문자 사용, 기본값 '\u0000')
           String   (클래스 타입, 여러 문자(문자열) 표현, 기본값 null)
           boolean  (1비트 또는 1바이트로 취급, true 또는 false만 표현, 기본값 false)
         */

    }
}
