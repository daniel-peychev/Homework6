package com.company;

public class MainOptionsMenu {


    public static void mainОptionMenu() {
        System.out.println("Главно меню с опции: \n");
        System.out.println("1.Работа с числа: " );
        System.out.println("2.Работа с думи: ");
        System.out.println("3.Изход от програмата: ");

    }

    public static void printMainOptionMenu(int num, int arr, int size){

        switch(num){
            case 1:
           System.out.println("1.Работа с числа: ");
            break;

            case 2:
                System.out.println("2.Работа с думи: ");
                break;

            case 3:
                System.out.println("3.Изход от програмата: ");
                break;


        }
    }

}
