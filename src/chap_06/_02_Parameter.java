package chap_06;

public class _02_Parameter {

    public static void power(int number){
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static void powerByExp(int number, int exp){
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exp + "승 은" + result);
    }

    public static void main(String[] args) {
        power(10);
        powerByExp(10,10);
    }
}
