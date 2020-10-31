import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 100: ");
        // возвращает число от 0 включительно до 1 невключительно [0; 1)
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        int a = (int) (1 + Math.random() * 100);
        if (t == a) {
            System.out.println("Верно");
        } else {
            for (; ; ) {
                if (t > a) {
                    System.out.println("Загаданное число меньше. Попробуй снова: ");
                }
                if (t < a) {
                    System.out.println("Загаданное число больше. Попробуй снова: ");
                }
                t = m.nextInt();
                if (t == a) {
                    System.out.println("Верно");
                    break;
                }
            }
        }
    }
}
