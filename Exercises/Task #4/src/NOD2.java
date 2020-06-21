import java.util.Scanner;

public class NOD2 {
    public static void main(String[] args) {

        System.out.println("Введите первое число");
        int number1 = (new Scanner(System.in)).nextInt();
        System.out.println("Введите второе число");
        int number2 = (new Scanner(System.in)).nextInt();
        int number = 1;

        if (number1 > number2) {
            number = number2;
        }
        else {
            number = number1;
        }

        for (; number > 1; number--) { //почему он доходит до 1, если в условии number > 1, а не >=1

            if (number1 % number == 0 && number2 % number == 0)
                break;
        }
        System.out.println("НОД = " + number);



    }
}

