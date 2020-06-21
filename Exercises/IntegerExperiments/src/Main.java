import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;


        //задание со *
        char d = '5';
        int f = Character.getNumericValue(d);
        System.out.println(f);

    }

    public Integer sumDigits(Integer number)
    {
        String numberToString = number.toString();
        int a = numberToString.length();
        int i;
        int sum = 0;
        for (i = 0; i < numberToString.length(); i++)
        {

            numberToString.charAt(i);
            String s = String.valueOf(numberToString.charAt(i));
            sum += Integer.parseInt(s);

        }
        System.out.println(sum);
        return 0;
    }
}

