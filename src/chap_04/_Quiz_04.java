package chap_04;
import java.util.Scanner;
public class _Quiz_04 {
    public static void main(String[] args) {
        Scanner inputTime = new Scanner(System.in);
        System.out.println("몇시간 주차 하셨나요?");
        double time = inputTime.nextDouble();

        Scanner inputSmallCar = new Scanner(System.in);
        System.out.println("경차/장애인 입니까?");
        boolean smallCar = inputSmallCar.nextBoolean();

        double money = time * 4000;

        if (money > 30000){
            money = 30000;
        }

        if (smallCar){
            money /= 2;
        }

        int result = (int)money;

        System.out.println("요금은 " + result + "원 입니다.");
    }
}
