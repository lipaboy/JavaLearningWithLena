public class App {
    public static void main(String[] args) {
        String str = "kek";
        if (str == "kek")
            System.out.println("Равно 1");

        String str2 = new String("kek");
        if (str2 == "kek")
            System.out.println("Равно 2");

        // используем метод .equals() для сравнений строк

        String str3 = "kek";
        if (str3.equals( "kek" ))
            System.out.println("Равно 3");

        String str4 = new String("kek");
        if (str4.equals( "kek" ))
            System.out.println("Равно 4");
    }
}
