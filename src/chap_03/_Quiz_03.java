package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String 주민번호1 = "901231-1234567";
        String 주민번호2 = "030708-4567890";

        System.out.println(주민번호1.substring(0,8));
        System.out.println(주민번호2.substring(0,8));

        System.out.println(주민번호1.substring(0,주민번호1.indexOf("-")+2));
        System.out.println(주민번호2.substring(0,주민번호2.indexOf("-")+2));
    }
}
