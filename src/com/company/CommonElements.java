package com.company;

public class CommonElements {
    public static int commonElement(int[] arr) {
        int count = 1;
        int common = arr[0];
        int temp = 0;
        for(int i = 0; i < (arr.length - 1); i++){
            int tempC = 0;
            temp = arr[i];
            for(int d = 0; d < arr.length; d++ ){
            if(temp == arr[d]){
                tempC++;
            }
            if(tempC > count){
                common = temp;
                count = tempC;
            }
            }
        }
        return common;
    }

    public static void commonElement() {
    }
}