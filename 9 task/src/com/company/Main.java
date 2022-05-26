package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = (sc.nextInt());
        double[] array = new double[size];
        System.out.println(array.length);
        System.out.println("Заполните массив ");
        double avg=0;
        for(int i = 0;i<size;i++){
          avg +=  array[i] = sc.nextDouble();
        }
        avg = avg/size;
        System.out.println("Вывод массива, где элементы умножены\nна среднее арифметическое: ");
        for(int i =0;i<size;i++){
            System.out.println(array[i]*avg);
        }
    }
}
