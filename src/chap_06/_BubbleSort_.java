package chap_06;

public class _BubbleSort_ {
    public static void main(String[] args) {

        int a = 967543210;
        String b = String.valueOf(a);
        String[] c = new String[b.length()];

        // c 에 배열 넣기 (완성)
        for (int i = 0; i < b.length(); i++) {
            c[i] = b.substring(i,i+1);
        }

        for (int i = c.length-1; i > -1 ; i--) {
            if (i==0){
                break;
            }
            for (int j = c.length-1; j > -1; j--) {
                if(j==0){
                    break;
                }
                int d = Integer.parseInt(c[j]);
                int e = Integer.parseInt(c[j-1]);

                if(d<e){
                    c[j-1] = String.valueOf(d);
                    c[j] = String.valueOf(e);

                }

            }

        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);

        }



    }
}
