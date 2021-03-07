package com.company;

import java.util.Scanner;

public class Main {

    public static char[] rightShift(char[] array, int step){
        for (int j = 0; j < step; j++) {
            for (int i = 0; i < array.length -1; i++) {
                array[i] += array[array.length - 1];
                array[array.length - 1] = (char) ((int) array[i] - (int) array[array.length - 1]);
                array[i] -= array[array.length - 1];
            }
        }
        return array;
    }

    public static void exportArray(char[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input number");
        int intInput =scanner.nextInt();
        char[] array = {'A', 'B', 'C', 'D', 'E'};
        array=rightShift(array, intInput);
        exportArray(array);
    }
}
