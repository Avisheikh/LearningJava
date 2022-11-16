package Array.ProgrammingExercises;


import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 16/11/2022 
*/
public class DistinctNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Let the use enter the numbers.
        enterNumbers(scanner, numbers);

        //check distinct values
        int [] distinctNumbers=distinctValue(numbers);

        // get total numbers of distinct numbers
        int totalNumbers = totalNumber(distinctNumbers);

        //print distinctNumbers

        System.out.println("The number of distinct numbers is " + totalNumbers);

        System.out.print("The The distinct numbers are: ");
        for (int i=0; i<distinctNumbers.length; i++) {
            if (distinctNumbers[i] != 0) {
                System.out.print(distinctNumbers[i] + " ");
            }
        }
    }

    private static int totalNumber(int[] distinctNumbers) {
        int total = 0;
        for (int i=0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] != 0) {
                total+=1;
            }
        }
        return total;
    }

    private static int[] distinctValue(int[] numbers) {

        int[] distinctNumbers = new int[numbers.length];
        int distinctIndex = 0;

        for (int i=0; i<numbers.length; i++) {
            int count = 0;
            for (int j=0; j<distinctNumbers.length;j++) {
                if (numbers[i] == distinctNumbers[j]) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                distinctNumbers[distinctIndex] = numbers[i];
                distinctIndex++;
            }
        }

//        for (int i=0; i<numbers.length; i++) {
//            for (int j=i+1; j<numbers.length; j++) {
//                if (numbers[i] != numbers[j]) {
//                    for (int k=0; k<distinctNumbers.length;k++) {
//                        if(numbers[i] == distinctNumbers[k]) {
//                            break;
//                        }
//                    }
//                }
//                break;
//            }
//        }
//        for (int i=0; i<numbers.length; i++) {
//            for (int k=0; k<distinctNumbers.length; k++) {
//                if(numbers[i] != distinctNumbers[k]) {
//                    distinctNumbers[lastIndex] = numbers[i];
//                    lastIndex = lastIndex+1;
//                }
//                break;
//            }
//        }

        return distinctNumbers;
    }

    private static void enterNumbers(Scanner scanner, int[] numbers) {
        System.out.println("Please enter the numbers.");
        int i = 0;
        do {
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < numbers.length);
    }

}
