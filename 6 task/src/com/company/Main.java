package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int choice;

    Scanner sc = new Scanner(System.in);

    System.out.println("Выберите что переводить: \n\t1 - Масса\n\t2 - Расстояние\n: ");
    choice = sc.nextInt();
    if(choice == 2) {
        Distance distance = new Distance();
        distance.distanceJob();
    }
    if(choice==1)
    {
        Weight weight = new Weight();
        weight.weightJob();
    }
    }
}
