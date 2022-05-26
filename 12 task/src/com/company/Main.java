package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userString = sc.nextLine();
        String modifiedString = userString.replace('a','o');
        //modifiedString = modifiedString.substring(7,11);
        if(userString.contains("Java")){
            if(userString.startsWith("I like")){
                if(userString.endsWith("!!!")) {
                    System.out.println(userString.toUpperCase());
                    System.out.println(modifiedString.substring(7,11));

                }
            }
        }
    }
}
