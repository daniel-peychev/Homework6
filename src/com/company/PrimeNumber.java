package com.company;

public class PrimeNumber {
    public static int primeNumbers(int[] array2){
        System.out.println("Извеждане само на простите числа от масива:");
        for( int num = 1; num <= 11; num++){
             int count = 0;

            for( int i = 2; i <= num/2; i++){

                if(num % i == 0){
                     count++;
                     break;
                 }

           }
            if(count == 0 && num != 1){
                System.out.println(num);
            }
        }
        return 0;
    }

    public static void primeNumbers() {
    }
}
