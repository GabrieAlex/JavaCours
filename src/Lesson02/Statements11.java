package Lesson02;

import javax.swing.*;

public class Statements11 {
    public static void main(String[] args) {

        int[] numbers = {15, 2, 36, 20, 7};

        //Part A:

        if (numbers[0] > numbers[1]) {

            if (numbers[0] > numbers[2]) {
                System.out.println(numbers[0]);
            } else {
                System.out.println(numbers[2]);
            }
        } else {
            if (numbers[1] > numbers[2]) {

                System.out.println(numbers[1]);
            } else {
                System.out.println(numbers[2]);
            }
        }

        //Part B:

        int result = 0;

        for (int number:numbers) {
            if (result<number)
                result=number;
        }
        System.out.println("the highest number "+ result);

        //Part C:
        int sum = 0;
        for (int number:numbers){
            sum +=number;
        }
        System.out.println("the sum of array "+sum);
    }
}
