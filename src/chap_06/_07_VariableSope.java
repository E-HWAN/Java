package chap_06;

public class _07_VariableSope {
    public static void methodA(){
        //System.out.println(number);
        //System.out.println(result);
    }

    public static void methodB(){
        int result = 1; // 지역 변수
    }


    public static void main(String[] args) {
        int number = 3;
        //System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
        }

        // 중괄호 안에서만 변수 사용이 가능함. (지역변수)
        System.out.println(number);



    }
}
