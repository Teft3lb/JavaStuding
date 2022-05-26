package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
	String firstNum =sc.next();
        System.out.println("Введите второе число: ");
	int secondNum = sc.nextInt();
	if(Integer.parseInt(firstNum)>secondNum){
        System.out.println("Первое число: \"" + firstNum +"\" больше второго");
        System.out.println("Меньшее число как double: " + Double.valueOf(secondNum));
    } else
    {
        System.out.println("Второе число: \"" + secondNum + "\" больше первого");
        System.out.println("Меньшее число как double: " + Double.valueOf(firstNum));
    }

}
}
