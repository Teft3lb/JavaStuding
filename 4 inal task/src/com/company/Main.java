package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
    String rightAnswer = "Заархивированный вирус";
    String userAnswer = "";
    boolean hint = true;
    int tries = 3;
    do{

        System.out.println("Отгадайте загадку: " + riddle + " .У вас осталось " +
                tries + " попыток.");
        if(hint){
            System.out.println("Для вывода подсказки введите \"Подсказка\" ");
        }
        userAnswer = sc.nextLine();
        if((hint)&&(userAnswer.equals("Подсказка"))){
            System.out.println("Там про вирусы");
            hint = false;
            tries =1;
            continue;
        }
        if(userAnswer.equalsIgnoreCase("Подсказка")) {
            System.out.println("Подсказка недоступна");
            continue;
        }
        tries--;
        if(!userAnswer.equalsIgnoreCase(rightAnswer)){
            if((tries==0)&&(!hint)){
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
            System.out.println("Подумай еще!");
        }
        else{
            System.out.println("Правильно!");
            tries =0;
            break;
        }
        hint = false;

    }while (tries!=0);

    }
}
