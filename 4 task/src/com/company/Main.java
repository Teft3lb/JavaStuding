package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int x,y,z,result =0;
        double a,b,c=0.1;
        System.out.println("Если Вы хотите работать с целыми числами нажмите 1, иначе 2");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Введите x: ");
                 x = sc.nextInt();

                System.out.println("Введите y: ");
                 y = sc.nextInt();

                System.out.println("Введите z: ");
                 z = sc.nextInt();
                result = (x+y+z)/3;
                System.out.println("Среднее арифметическое введенных чисел: " + result);
                result = result/2;
                if (result>3) System.out.println("Программа выполнена корректно");
                break;
            case 2:
                System.out.println("Введите x: ");
                a = sc.nextDouble();

                System.out.println("Введите y: ");
                b = sc.nextDouble();

                System.out.println("Введите z: ");
                c = sc.nextDouble();

                result =(int)((a+b+c)/3);
                System.out.println("Среднее арифметическое введенных чисел: " + ((a+b+c)/3));
                result = result/2;
                if (result>3) System.out.println("Программа выполнена корректно");
        }

    }
}
