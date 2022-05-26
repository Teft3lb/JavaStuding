package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String userString = sc.nextLine();
        Pattern pattern = Pattern.compile("[^0-9а-яА-Я\\s]+");
        Matcher matcher = pattern.matcher(userString);
        int counter = 0;
        while (matcher.find()) {
            System.out.println("Вывод только латинский слов: " + matcher.group());
            counter++;
        }
        System.out.println("Введенная строка содержит " + counter + " слов состоящих только из латинцы");
    }
}
