package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("- Курс доллара: ");
	float exchange =sc.nextFloat();
        System.out.println("- Количество рублей: ");
	int rub = sc.nextInt();
        while (rub<0){
            System.out.println("- Введите положительное число: ");
            rub = sc.nextInt();
    }
        System.out.printf("- Итого: %.2f долларов",(rub/exchange));
    }
}
