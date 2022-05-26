package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    //Объявляем переменную для инициализации рандомных чисел
    Random rnd = new Random();
    //Объявляем массив
	int[] array = new int[5];

        System.out.println("Инициализировали следующий массив: ");
    //Заполняем массив рандомными числами
	for(int i = 0; i< array.length;i++) {
        array[i] = rnd.nextInt(10);
        System.out.print(" " + array[i]);
    }
        System.out.println("\n");

	//Меняем местами первый и последний элементы
        array[array.length- array.length] += array[array.length-1];
	    array[array.length-1] = array[array.length- array.length]-array[array.length-1];
        array[array.length- array.length] -= array[array.length-1];

    //Выводим в консоль полученный массив
        System.out.println("Получили следующий результат: ");
        for(int i = 0; i< array.length;i++) {
            System.out.print(" " + array[i]);
        }
    //Выводим результат суммы первого и среднего элементов массива
        System.out.println("\nСумма первого и среднего элементов массива: " +
                (array[array.length- array.length] + array[array.length/2]));
    }
}
