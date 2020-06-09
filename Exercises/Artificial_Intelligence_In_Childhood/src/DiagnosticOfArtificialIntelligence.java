import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DiagnosticOfArtificialIntelligence {

    public static void main (String[] args) {

        try {
            ArtificialIntelligence childAI =
                    new ArtificialIntelligence("Nancy", 1,
                            new SimpleDateFormat("dd-mm-yyyy").parse("18-05-2020"));

            System.out.println("Начинаем диагностику...");

            /**
             * Задание 1: по переменной thought понять, что ИИ расстроен
             * (т.е. имеет негативную эмоциональную окраску в мысли).
             */
            Thought thought = childAI.reflex();

            /**
             * Ниже будет какой-то сложный код, в котором НЕ нужно разбираться.
             */

            System.out.println("Анализ мыслей:");
            final int COUNT_ITERATIONS = 5;
            for (int i = 0; i < COUNT_ITERATIONS; i++) {
                thought = childAI.reflex();
                System.out.print("Обработка мысли №" + (i + 1));
                for (int j = 0; j < 4; j++) {
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(250);
                }
                System.out.println();
                thought.lost();
            }

            /**
             * Конец сложного кода
             */

            /**
             * Задание 2: вывести предупреждение (*), что ИИ расстроен (то, что ты поняла из Задание 1).
             * Иначе ничего не выводить.
             *
             * P.S. Нельзя писать проверку типа "if (thought.emotionalType == NEGATIVE)",
             * потому что объект, на который ссылается переменная thought, недоступен!
             */

            // Выводить предупреждение нужно именно здесь (*)

            //-----------------------------
            System.out.println("Диагностика завершена.");
        }
        catch (InterruptedException | ParseException exp) {
            System.out.println(exp.getMessage());
        }
    }

}
