import java.util.Scanner;

public class Gruzovik {
    private static final int KOLICHESTVO_CONTEINEROV = 12;
    private static final int MAX_KOLICHESTVO_YASHIKOV = 27;


    public static void main(String[] args) {
        int boxAmount = new Scanner(System.in).nextInt();

        int kolichestvoKonteinerov = boxAmount / MAX_KOLICHESTVO_YASHIKOV;

        int yashFirst = 1;
        int yashLast = 27;

        double gruz1 = (int) Math.ceil((double) boxAmount / (double) MAX_KOLICHESTVO_YASHIKOV / (double) KOLICHESTVO_CONTEINEROV);
        for (int gruz = 1; gruz <= gruz1; gruz++) {
            System.out.println("Грузовик: " + gruz);
            {
                for (int kont = 1; kont <= kolichestvoKonteinerov; kont++) {
                    System.out.println("Контейнер: " + kont);
                    // container #kont.
                    for (int yash = yashFirst; yash <= yashLast; yash++) {
                        System.out.println("\tЯщик: " + yash);
                    }


                    yashFirst = yashLast + 1;
                    yashLast = yashFirst + 26;

                }
                if (boxAmount % 27 != 0) {
                    int kilvo = kolichestvoKonteinerov + 1;
                    System.out.println("Контейнер: " + kilvo);
                    for (int yash = yashFirst; yash <= boxAmount; yash++) {
                        System.out.println("\tЯщик: " + yash);
                    }
                }
            }
        }
    }
}


