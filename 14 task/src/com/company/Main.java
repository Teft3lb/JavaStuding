package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random rnd = new Random();
	int[] array = new int[20];
	int min = 0,max = 0;
	for (int i=0;i<array.length-1;i++)
    {
        array[i] = rnd.nextInt(40)-20;

        if(array[i]<min) min=array[i];


        if(array[i]>max)max= array[i];


    }

        System.out.println("Минимальное " + min);
        System.out.println("Максимальное " + max);

        if(Math.abs(min)>Math.abs(max)){
            System.out.println("Минимальное число \"" + Math.abs(min) +
                    "\" по модулю больше максимального \"" + Math.abs(max) + "\"");
        }else if (Math.abs(min)==Math.abs(max)){
            System.out.println("Числа \"");
        }

        else
            { System.out.println("Минимальное число \"" +  Math.abs(min) +
                "\" по модулю меньше максимального \"" + Math.abs(max) + "\"");
    }
    }
}
