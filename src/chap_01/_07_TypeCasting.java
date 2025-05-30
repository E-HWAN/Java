package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변화 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to flaot, double
        int score = 93;
        System.out.println(score);
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        // float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f); // 실제 변수 타입이 변환되지는 않음
        System.out.println((int)score_d);

        // 정수 + 실수 연산

        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = /*(double)*/ 93 + 98.8;
        System.out.println(score_d);

        // 변수에 형 변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double (자동 형 변환)

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형 변환)
        System.out.println(convertedScoreDouble);

        // 숫자를 문자열로
        String s1 =String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);
        System.out.println(s1.getClass().getName());

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); //93
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("자바");



    }
}
