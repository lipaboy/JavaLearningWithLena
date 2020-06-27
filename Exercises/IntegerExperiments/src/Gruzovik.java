import java.util.Scanner;

public class Gruzovik {
    private static final int MAX_KOLICHESTVO_CONTEINEROV = 12;
    private static final int MAX_KOLICHESTVO_YASHIKOV = 27;


    public static void main(String[] args) {
        int boxAmount = new Scanner(System.in).nextInt();

        int kolvoPolniyKonteinerov = boxAmount / MAX_KOLICHESTVO_YASHIKOV;
        int kilvoReal;
        if (boxAmount % 27 != 0) {
            kilvoReal = kolvoPolniyKonteinerov + 1;
        } else {
            kilvoReal = kolvoPolniyKonteinerov;
        }


        int yashFirst = 1;
        int yashLast = 27;
        int kontFirst = 1;
        int kontLast = 12;

        int gruzPolniyKolvo = kilvoReal / 12;

        // заполняем полные грузовики контейнерами

        for (int gruz = 1; gruz <= gruzPolniyKolvo; gruz++) {
            if (gruz == gruzPolniyKolvo + 1) {
                break;
            }
            System.out.println("Грузовик: " + gruz);

            // заполняем контейнеры ящиками до конца. Здесь не учитывается неполный контейнер

            for (int kont = kontFirst; kont <= kontLast; kont++) {
                System.out.println("Контейнер: " + kont);
                // container #kont
                for (int yash = yashFirst; yash <= yashLast; yash++) {
                    System.out.println("\tЯщик: " + yash);

                }

                yashFirst = yashLast + 1;
                yashLast = yashFirst + 26;

            }

            kontFirst = kontLast + 1;
            kontLast = kontFirst + 11;


            // остаток по ящикам засовываем в остаточный контейнер

            int yashLast2 = yashLast;
            yashLast = boxAmount - (yashLast - 26);
            if (yashLast < 27)
            {
            int gruz2 = gruz + 1;
            System.out.println("Грузовик: " + gruz2);
            System.out.println("Контейнер: " + kolvoPolniyKonteinerov);
            for (int yash = yashFirst; yash <= boxAmount; yash++)
                {
                System.out.println("\tЯщик: " + yash);
                }

            }

            // обрабатываем случай, когда грузовик не заполнен контейнерами до конца

            if (kolvoPolniyKonteinerov % 12 !=0 ) {
                yashLast = yashLast2;
                gruz = gruzPolniyKolvo+1;
                System.out.println("Грузовик: " + gruz);
                for (int kont = kontFirst; kont <= kolvoPolniyKonteinerov; kont++) {
                    System.out.println("Контейнер: " + kont);
                    // container #kont
                    for (int yash = yashFirst; yash <= yashLast; yash++) {
                        System.out.println("\tЯщик: " + yash);

                    }
                    yashFirst = yashLast + 1;
                    yashLast = yashFirst + 26;
                }
                if (boxAmount % 27 != 0) {
                    yashLast = boxAmount;
                    int kolvo = kolvoPolniyKonteinerov + 1;
                    System.out.println("Контейнер: " + kolvo);
                    for (int yash = yashFirst; yash <= yashLast; yash++) {
                        System.out.println("\tЯщик: " + yash);
                    }

                }
            }
        }
    }
}








