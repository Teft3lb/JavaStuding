package com.company;

import java.util.Scanner;

public class Weight {
    private int choice;
    private float userVariable;
    Scanner sc = new Scanner(System.in);
    public void weightJob()
    {
        System.out.println("Выберите единицу измерения\n\t1 - Килограмм\n\t2 - Грамм\n\t3 - Фунт(Английский)\n\t4 - Пуд");
        choice = sc.nextInt();
       switch(choice){
           case 1://Обрабатываем килограммы
               System.out.println("Введите число: ");
               userVariable = sc.nextFloat();
               System.out.printf("Результат:\n\tКилограмм: " + userVariable + "\n\tГрамм: %.3f" +
                       "\n\tФунт(Английский): %.3f" + "\n\tПуд: %.3f",(userVariable*1000), (userVariable*2.2),(userVariable * 0.061)
               );break;
           case 2: //Обрабатываем граммы
               System.out.println("Введите число: ");
               userVariable = sc.nextFloat();
               System.out.printf("Результат:\n\tГраммы: " + userVariable + "\n\tКилограмм: %.3f" +
                       "\n\tФунт(Английский): %.3f" + "\n\tПуд: %.3f",(userVariable*0.001), (userVariable*0.0022),(userVariable * 0.000061)
               );break;
           case 3: //Обрабатываем фунты
               System.out.println("Введите число: ");
               userVariable = sc.nextFloat();
               System.out.printf("Результат:\n\tФунты(Английские): " + userVariable + "\n\tКилограмм: %.3f" +
                       "\n\tГрамм: %.3f" + "\n\tПуд: %.3f",(userVariable*1.36), (userVariable*1360.78),(userVariable * 0.083)
               );break;
           case 4: //Обрабатываем пуды
               System.out.println("Введите число: ");
               userVariable = sc.nextFloat();
               System.out.printf("Результат:\n\tПуд: " + userVariable + "\n\tКилограмм: %.3f" +
                       "\n\tГрамм: %.3f" + "\n\tФунт(Английский): %.3f",(userVariable*16.38), (userVariable*16380),(userVariable * 36.11)
               );break;
       }
    }
}
