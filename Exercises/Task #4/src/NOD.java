import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {

        System.out.println("Введите первое число");
        int number1 = (new Scanner(System.in)).nextInt();
        System.out.println("Введите второе число");
        int number2 = (new Scanner(System.in)).nextInt();

        int nod = 1;
        int nod2 = 1;
        int numberA = 1;
        int numberB = 1;

        if (number1 > number2) {
            numberA = number1;
            numberB = number2;
        }
        if (number2 > number1) {
            numberA = number2;
            numberB = number1;
        }
        if (number1 == number2) {
            System.out.println("НОД = " + number1);

        } else {

            for (; numberA >= 0; numberA--) {
                if (numberA > numberB)
                    numberA = numberA - numberB;
                    nod = numberB;
                if (numberB > numberA)
                    numberB = numberB - numberA;
                    nod = numberA;
            }
            {
                if (number1 % nod == 0 && number2 % nod == 0) {
                    System.out.println("НОД = " + nod);
                } else {
                    System.out.println("НОД = 1");
                }

            }
        }
    }
}




