import java.text.DecimalFormat;

public class Main {
    public static final int PATIENTS = 30;
    public static final float MIN_TEMP = 32;
    public static final float MAX_TEMP = 40;
    public static final double HEALTHY_MIN = 36.2;
    public static final double HEALTHY_MAX = 36.9;

    public static void main(String args[]) {
        DecimalFormat temp = new DecimalFormat("##.#");
        float[] a = new float[PATIENTS];
        float b = 0;
        int f = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = ((float) (Math.random() * (MAX_TEMP - MIN_TEMP)) + MIN_TEMP);
            System.out.println(temp.format(a[i]));
            b = b + a[i] / PATIENTS;
            if (a[i] >= HEALTHY_MIN && a[i] <= HEALTHY_MAX) {
                f += 1;
            }
        }
        System.out.println("Средняя температура: " + temp.format(b));
        System.out.println("Количество здоровых пациентов: " + f);

    }
}
