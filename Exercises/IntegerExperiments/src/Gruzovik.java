import java.util.Scanner;

public class Gruzovik {
    private static final int KOLICHESTVO_CONTEINEROV = 12;
    private static final int MAX_KOLICHESTVO_YASHIKOV = 27;


    public static void main(String[] args) {
        int boxAmount = new Scanner(System.in).nextInt();

        double kolichestvoKonteinerov = (int) Math.ceil((double) boxAmount / MAX_KOLICHESTVO_YASHIKOV);

        int kolvoKontOst = (boxAmount % MAX_KOLICHESTVO_YASHIKOV);

     //Предполагаю, что так я высчитываю остаток для последнего контейнера;
        int a;
        for (a = boxAmount; a>=0; a-=27){
        }
        int ost = 27 - a;

        int yashFirst = 1;
        int yashLast = 27;
        double gruz1 = Math.ceil(kolichestvoKonteinerov / KOLICHESTVO_CONTEINEROV);

        for (int gruz = 1; gruz <= gruz1; gruz++) {
            System.out.println("Грузовик: " + gruz);
            for (int kont = 1; kont <= kolichestvoKonteinerov; kont++) {
                System.out.println("Контейнер: " + kont);
                // container #kont
                // ящики считаются столько раз по 27 сколько контейнеров. Нужно отминусить ящики и остаток засунуть в последний конт
                for (int yash = yashFirst; yash <= yashLast; yash++) {
                    System.out.println("\tЯщик: " + yash);

                }

                yashFirst = yashLast + 1;
                yashLast = yashFirst + 26;

            }
        }
    }
}