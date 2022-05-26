package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowCount = 0;
        System.out.println("Введите количество строк ");
        rowCount = sc.nextInt();
        int counter = 0;
        int counter_index=0;

        String[] userStrings = new String[rowCount];
        System.out.println("Заполните массив строк: ");
        for (int i = 0; i < userStrings.length; i++) {
            userStrings[i] = sc.next();
        }
        long [] buf = new long[rowCount];
        System.out.println("Количество строк: " + userStrings.length);
        for (int i = 0; i < userStrings.length; i++) {
            buf[i] = userStrings[i].toLowerCase().chars().distinct().summaryStatistics().getCount();
            System.out.printf("Строка %s: %s\n", i+1, userStrings[i]);
        }
        for (int i = 0; i < buf.length; i++) {
            if (buf[i] > counter) {
                counter = (int) buf[i];
                counter_index = i;
            }
        }
        System.out.println("Ответ: " + userStrings[counter_index]);
    }
}
