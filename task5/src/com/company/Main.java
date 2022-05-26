package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float firstNum, secondNum;
        char math;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        firstNum = sc.nextFloat();
        System.out.println("Введите второе число: ");
        secondNum = sc.nextFloat();
        System.out.println("Введите действие: ");
        math = sc.next().charAt(0);

        switch(math){
            case '*':
                System.out.println("Результат умножения: " + (firstNum*secondNum));
                break;
            case '/':
                System.out.println("Результат деления: " + (firstNum/secondNum));
                break;
            case '+':
                System.out.println("Результат сложения: " + (firstNum+secondNum));
                break;
            case '-':
                System.out.println("Результат вычитания: " + (firstNum-secondNum));
                break;
        }
    }
}
