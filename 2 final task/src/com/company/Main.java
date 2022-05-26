package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buffer = sc.nextLine();
        System.out.println("- Ввод: " + buffer);
        if (buffer.indexOf('x') == 4) {
            int firstNum = Integer.parseInt(String.valueOf(buffer.charAt(0)));
            int secondNum = Integer.parseInt(String.valueOf(buffer.charAt(2)));
            switch (buffer.charAt(1)) {
                case '+':
                    System.out.printf("- Вывод: %s",(firstNum + secondNum));
                    break;
                case '-':
                    System.out.printf("- Вывод: %s",(firstNum - secondNum));
                    break;
            }

        }
        if (buffer.indexOf('x') == 0) {
            int firstNum = Integer.parseInt(String.valueOf(buffer.charAt(2)));
            int secondNum = Integer.parseInt(String.valueOf(buffer.charAt(4)));
            switch (buffer.charAt(1)) {
                case '+':
                    System.out.printf("- Вывод: %s",(secondNum - firstNum));
                    break;
                case '-':
                    System.out.printf("- Вывод: %s",(secondNum + firstNum));
                    break;
            }
    }

        if (buffer.indexOf('x') == 2) {
            int firstNum = Integer.parseInt(String.valueOf(buffer.charAt(0)));
            int secondNum = Integer.parseInt(String.valueOf(buffer.charAt(4)));
            switch (buffer.charAt(1)) {
                case '+':
                    System.out.printf("- Вывод: %s",(secondNum - firstNum));
                    break;
                case '-':
                    System.out.printf("- Вывод: %s",(firstNum - secondNum));
                    break;
            }
        }
}
}