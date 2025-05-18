package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열이 같은지 비교
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 관계없이 같은지 확인

        //문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (같은 곳을 참조)
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // 참조 하는곳을비교

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // 새로운 문자열 변수를 선언 함으로서 서로 다른 참조이므로 false

    }
}
