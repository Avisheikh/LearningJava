package Array.ProgrammingExercises;

import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 16/11/2022 
*/
public class DistinctNumbersEasy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] distinctNumber = new int[10];
        int count = 0;
        int num;

        System.out.println("Please enter the number");
        for (int i=0; i<distinctNumber.length;i++) {
            num = scanner.nextInt();
            if(distinctNumbers(num,distinctNumber)) {
                distinctNumber[count] = num;
                count++;
            }
        }

        System.out.print("The distinct numbers are");
        for (int i=0; i<distinctNumber.length;i++) {
            if (distinctNumber[i] > 0) {
                System.out.print(" " + distinctNumber[i]);
            }
        }

    }

    private static boolean distinctNumbers(int num, int[] distinctNumber) {
        for (int i=0; i<distinctNumber.length; i++) {
            if (num == distinctNumber[i]) {
                return false;
            }
        }
        return true;
    }
}
