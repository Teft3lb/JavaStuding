package com.company;

import java.util.Scanner;

public class Distance{
    private int choice;
    private float userVariable;
    Scanner sc = new Scanner(System.in);
    public void distanceJob() {
        System.out.println("Выберите единицу измерения : \n\t1 - Метр\n\t2 - Миля\n\t3 - Ярд\n\t4 - Фут");
        choice = sc.nextInt();
        switch (choice) {
            case 1: //обработка метров
                System.out.println("Введите число: ");
                userVariable = sc.nextFloat();
                System.out.printf("Результат:\n\tМетры: " + userVariable + "\n\tМили: %.3f" +
                                "\n\tЯрды: %.3f" + "\n\tФуты: %.3f",
                        (userVariable * 0.00062), (userVariable / 0.9144), (userVariable / 0.3048)
                );break;
            case 2: //обработка миль
                System.out.println("Введите число: ");
                userVariable = sc.nextFloat();
                System.out.printf("Результат:\n\tМили: " + userVariable + "\n\tМетры: %.3f" +
                                "\n\tЯрды: %.3f" + "\n\tФуты: %.3f",
                        (userVariable / 0.00062), (userVariable * 1760), (userVariable * 5280)
                );break;
            case 3: //обработка ярдов
                System.out.println("Введите число: ");
                userVariable = sc.nextFloat();
                System.out.printf("Результат:\n\tЯрды: " + userVariable + "\n\tМили: %.5f" +
                                "\n\tМетры: %.3f" + "\n\tФуты: %.3f",
                        (userVariable * 0.00057), (userVariable * 0.9144), (userVariable *3)
                );break;
            case 4: // обработка футов
                System.out.println("Введите число: ");
                userVariable = sc.nextFloat();
                System.out.printf("Результат:\n\tФуты: " + userVariable + "\n\tМили: %.5f" +
                                "\n\tМетры: %.3f" + "\n\tЯрды: %.3f",
                        (userVariable * 0.00019), (userVariable * 0.3), (userVariable * 0.33)
                );break;
        }
    }
}
