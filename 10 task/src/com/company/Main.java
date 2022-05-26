package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int row;
	int column;
        System.out.println("Введите количество строк матрицы: ");
        row = sc.nextInt();
        System.out.println("Введите количество столбцов матрицы: ");
        column = sc.nextInt();
        int[] [] array = new int[row][column];
        System.out.println("Заполните матрицу: ");
        for(int i = 0;i<row;i++){
            for(int j =0;j<column;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Первая строка матрицы умноженная на 3: ");
        for(int i = 0;i<1;i++){
            for(int j =0;j<column;j++){
                System.out.println(array[i][j]*3);
            }
        }
    }
}
