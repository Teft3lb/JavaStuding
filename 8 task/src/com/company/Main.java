package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int choice = sc.nextInt();
        int sum = 0;
        for (int i = 1;i<=choice;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Сумма всех введенных нечетных чисел: " + sum);
    }
}
