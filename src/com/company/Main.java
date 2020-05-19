package com.company;

public class Main {

    public static void main(String[] args) {
        MainOptionsMenu.printMainOptionMenu(1,2,3);
        System.out.println("\n");
        OptionMenu.optionMenu();

        //Извеждане само на простите числа от масива.
        int[] array2 =new int[]{};
        PrimeNumber.primeNumbers(array2);

        //Извеждане на най-често срещан елемент в масива.
        int[] array = new int[]{1, 1, 1, 2, 3, 4, 4};
        System.out.println("Извеждане на най-често срещан елемент в масива: " + CommonElements.commonElement(array));


    }

}
