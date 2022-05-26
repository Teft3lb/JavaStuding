package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        Random rnd= new Random();
        int x = rnd.nextInt(9);
        int y= rnd.nextInt(9);
        int z = rnd.nextInt(9);

        System.out.println("Заданы следующие константы:\nx = " + x + "\ny = " + y + "\nz = " + z);
        System.out.println("Заполните массив: ");
        for (int i =0;i<size;i++){
            array[i] = sc.nextInt();
        }
        for (int i =0;i<size;i++){
            if((array[i]==x)||(array[i]==y)||(array[i]==z)){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }

    }
}
