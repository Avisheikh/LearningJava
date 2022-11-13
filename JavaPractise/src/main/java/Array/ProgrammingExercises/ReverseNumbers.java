package Array.ProgrammingExercises;

//(Reverse the numbers entered) Write a program that reads 10 integers then dis-
//        plays them in the reverse of the order in which they were read.

import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 13/11/2022 
*/
public class ReverseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];


        for (int i = 0 ; i < numbers.length; i++) {
            System.out.println("Please the non negative number which need to be reversed for " + i);
            numbers[i] = scanner.nextInt();
        }

        //reverseNumber(numbers);
        reverseNumberEasy(numbers);

        //print
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    private static void reverseNumberEasy(int[] numbers) {
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static void reverseNumber(int[] numbers) {
        int currentMaxIndex = numbers.length-1;
        for (int i = 0; i < numbers.length; i++) {
            if ( currentMaxIndex < i) {
                break;
            }
            int temp = numbers[currentMaxIndex];
            numbers[currentMaxIndex] = numbers[i];
            numbers[i] = temp;
            currentMaxIndex--;
        }
    }

}
