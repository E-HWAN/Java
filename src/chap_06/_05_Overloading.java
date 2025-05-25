package chap_06;

public class _05_Overloading {

    public static int getPower(int number){
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static int getPower(String number, String exponent){
        int result = 1;
        for (int i = 0; i < Integer.parseInt(exponent); i++) {
            result *= Integer.parseInt(number);
        }
        return result;
    }

    public static void main(String[] args) { // 메소드 오버로딩은 전달값의 형태가 다르면 여러개 선언 가능
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3));
        System.out.println(getPower("3","4"));
    }
}
