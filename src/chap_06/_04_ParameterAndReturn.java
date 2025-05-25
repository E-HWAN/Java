package chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number){
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPowerExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {

        // 전달값과 반환값이 있는 메소드
        int returnVal = getPower(2);
        System.out.println(returnVal); // 2*2=4

        returnVal = getPower(3);
        System.out.println(returnVal); // 3*3=9

        returnVal = getPowerExp(3,3);
        System.out.println(returnVal); // 3*3*3 = 27

        System.out.println(getPowerExp(3,4)); // 3*3*3*3 = 81

    }
}
