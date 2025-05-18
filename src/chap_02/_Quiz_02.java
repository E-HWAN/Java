package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int Height;
        Height = 115;
        int standardHeight = 120;
        System.out.println("키가 " + Height + "cm 이므로 " + (Height >= standardHeight ? "탑승 가능합니다" : "탑승 불가능합니다"));

        Height = 121;
        System.out.println("키가 " + Height + "cm 이므로 " + (Height >= standardHeight ? "탑승 가능합니다" : "탑승 불가능합니다"));

    }
}
