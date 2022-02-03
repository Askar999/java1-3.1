package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] numbers = {12.5, -5.4, 99.9, -1.9, 45.8, 91.4, -33.1,
                67.5, -1.8, 98.2, 789.7, -0.1, 876.2, 90.0, 1000.5};
        double sum = 0;
        int counter = 0;
        boolean isNegative = false;


        for (double each : numbers) {
            if (each > 0 && isNegative) {
                sum += each;
                counter++;
//                System.out.println(each);
            } else if (each < 0) {
                isNegative = true;
            }
        }

//        System.out.println();
//        System.out.println(sum / counter);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int k = 0; k < numbers.length - i - 1; k++) {
                if (numbers[k] > numbers[k + 1]) {
                    double temp = numbers[k + 1];
                    numbers[k + 1] = numbers[k];
                    numbers[k] = temp;
                }

            }
            System.out.println(Arrays.toString(numbers));

        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
    }
}
