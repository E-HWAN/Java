package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열이 같은지 비교
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 관계없이 같은지 확인

    }
}
