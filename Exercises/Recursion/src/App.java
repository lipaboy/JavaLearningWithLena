import java.util.concurrent.TimeUnit;

public class App {

    public void kekFunc() throws InterruptedException {
        System.out.println("Начало работы функции kekFunc()...");
        TimeUnit.MILLISECONDS.sleep(400);
        lolFunc();
        System.out.println("Конец работы функции kekFunc().");
    }

    public void lolFunc() throws InterruptedException {
        System.out.println("Начало работы функции lolFunc()...");
        TimeUnit.MILLISECONDS.sleep(400);
        kekFunc();
        System.out.println("Конец работы функции lolFunc().");
    }

    public static void main(String[] args) throws InterruptedException {
        new App().kekFunc();
    }
}
