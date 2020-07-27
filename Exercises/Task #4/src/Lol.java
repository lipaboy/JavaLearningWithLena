import java.util.Scanner;

public class Lol {
    public static void main(String[] args) {
        String a = "Lol kek cheburek";
        String[] b = a.split("\\s+");

        // заполнение любого массива
        String[] c = new String[]{"lol", "kek", "cheburek", "foo", "bar"};
//        c[0] = "lol";
//        c[1] = "kek";
//        c[2] = "cheburek";
        int[] s = new int[]{1, 2, 3};
        int i;
        for (i = c.length - 1; i >= 0; i--) {
            //System.out.println(c[i]);
        }
        i = 0;
//        for (int j = 0; j < c.length; j++) {
//            c[0] = c[j];
//            System.out.println(c[i]);
//        }

//        int c[i] = 2;
//        int c[j] = 3;
//        int temp;
//        temp = a1;
//        a1 = a2;
//        a2 = temp;
//
//
//        String f = c[0];
//        c[0] = c[4];
//        a = c[1];
//        c[1] = c[3];
//        c[2] = c[2];
//        c[3] = a;
//        c[4] = f;

        int g = 0;
        String d = "";
        i = 0;
        // попробовать с чётным количеством элементов
        for (; i < c.length/2; i++) {
            g += 1;

//            String s1 = c[i];
//            String s2 = c[c.length - g];
//
//            d = s1;
//            s1 = s2;
//            s2 = d;

            d = c[i]; //0
            // c[i] swap with c[c.length - g]
            c[i] = c[c.length - g]; //n
            c[c.length - g] = d; //0
        }


        for (i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
