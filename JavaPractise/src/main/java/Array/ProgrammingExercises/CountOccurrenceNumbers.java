package Array.ProgrammingExercises;


//(Count occurrence of numbers) Write a program that reads the integers between
//        1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here
//        is a sample run of the program: Note that if a number occurs more than one time, the
//        plural word “times” is used in the output. Numbers are displayed in increasing order.

import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 14/11/2022 
*/
public class CountOccurrenceNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the number
//        int[] numbers = enteringNumbers(scanner);

        int[] numbers = {2,5,6,5,2,2,2,4,3,23,43,2,0};

        // sorting into increasing order
        selectionSort(numbers);

        // checking reoccurrence
        reoccurrenceNumbers(numbers);
        //countOccurence(numbers);


        // print sorted in increasing order
        for (int i=0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static void reoccurrenceNumbers(int[] numbers) {
        int[] counts = new int[numbers.length];
        for (int i = 0; i < numbers.length-1; i++) {
            int count = 1;
            for (int j= i+1; j < numbers.length-1; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    i = j;
                }
            }
            if (numbers[i] != 0) {
                counts[i] = count;
                System.out.printf("%d occurs %d %s%n",numbers[i], counts[i], counts[i] > 1 ? "times":"time");
            }

        }
    }

    public static void countOccurence(int[] list) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i)
                    count += 1;
            }
            if (count != 0)
                System.out.printf("%d occurs %d %s%n",
                        i, count, count > 1 ? "times" : "time");
        }
    }

    private static void selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int currentMin = numbers[i];
            int currentMinIndex = i;

            for (int j = i+1; j < numbers.length; j++) {
                if (currentMin > numbers[j]) {
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }
    }

//    private static int[] enteringNumbers(Scanner scanner) {
//        int[] numbers = new int[10];
//        for (int i = 0; i<numbers.length; i++) {
//            System.out.println("Please enter any number from 1 to 100;");
//            numbers[i] = scanner.nextInt();
//        }
//        return numbers;
//    }

}
