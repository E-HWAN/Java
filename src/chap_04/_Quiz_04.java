package chap_04;
import com.sun.org.apache.xerces.internal.xs.XSModel;

import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {

        Scanner inputSmallCar = new Scanner(System.in);
        System.out.println("경차 인가요?");
        boolean smallCar = inputSmallCar.nextBoolean();

        Scanner inputTime = new Scanner(System.in);
        System.out.println("몇시간 주차 하셨나요?");
        double time = inputTime.nextDouble();

        double money = time * 4000;

        if (money>30000){
            money = 30000;
        }

        if (smallCar){
            money = money/2;
        }

        int result = (int)money;



        System.out.println(result + "원 입니다.");

    }
}
