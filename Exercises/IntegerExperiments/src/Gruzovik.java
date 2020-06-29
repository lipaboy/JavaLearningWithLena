import java.util.Scanner;

public class Gruzovik {
    private static final int MAX_KOLICHESTVO_CONTEINEROV = 12;
    private static final int MAX_KOLICHESTVO_YASHIKOV = 27;


    public static void main(String[] args) {
        System.out.println("Введите количество ящиков: ");
        int boxAmount = new Scanner(System.in).nextInt();

        int yashFirst = 1;
        int yashLast = 27;
        int kontFirst = 1;
        int kontLast = 12;
        int yashik = 1;

        double gruzLast = (int) Math.ceil((double) boxAmount / MAX_KOLICHESTVO_CONTEINEROV / MAX_KOLICHESTVO_YASHIKOV);

        for (int gruz = 1; gruz <= gruzLast; gruz++) {
            if (yashik == boxAmount + 1)
                break;
            System.out.println("Грузовик: " + gruz);

            for (int kont = kontFirst; kont <= kontLast; kont++) {
                if (yashik == boxAmount + 1)
                    break;
                System.out.println("\tКонтейнер: " + kont);

                // container #kont
                for (yashik = yashFirst; yashik <= yashLast; yashik++) {
                    if (yashik == boxAmount + 1) {
                        break;
                    }
                    System.out.println("\t\tЯщик: " + yashik);

                }

                yashFirst = yashLast + 1;
                yashLast = yashFirst + 26;

            }

            kontFirst = kontLast + 1;
            kontLast = kontFirst + 11;

        }
    }
}









