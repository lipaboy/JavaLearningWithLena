package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, "Петь");
        arrayList.add(1, "Танцевать");
        arrayList.add(2, "Рисовать");

        for (; ; ) {
            System.out.println("Введите действие: ");
            String deistvie = new Scanner(System.in).nextLine();
            String[] f = deistvie.split(" ");

            if (f.length == 0) {
                if (deistvie.equals("LIST")) {
                    int numb = 0;
                    for (int i = 0; i < arrayList.size(); i++) {
                        numb++;
                        System.out.println(numb + " " + arrayList.get(i));
                    }
                }

                if (deistvie.equals("ADD")) {
                    System.out.println("Введите дело, которое хотите добавить: ");
                    String delo = new Scanner(System.in).nextLine();
                    arrayList.add(delo);
                }
            } else if (f.length == 1) {

                int chislo = Integer.parseInt(f[1]);

                if ((f[0] + f[1]).equals("ADD" + chislo)) {
                    System.out.println("Введите дело, которое хотите добавить: ");
                    String delo = new Scanner(System.in).nextLine();
                    arrayList.add(chislo - 1, delo);
                }

                if ((f[0] + f[1]).equals("EDIT" + chislo)) {
                    arrayList.remove(chislo - 1);
                    System.out.println("Введите дело, на которое хотите изменить: ");
                    String delo = new Scanner(System.in).nextLine();
                    arrayList.add(chislo - 1, delo);
                }

                if ((f[0] + f[1]).equals("DELITE" + chislo)) {
                    arrayList.remove(chislo - 1);
                }
            }
        }
    }
}
