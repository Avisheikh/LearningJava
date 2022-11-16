package Array.ProgrammingExercises;

//(Analyze scores) Write a program that reads an unspecified number of scores and
//        **7.5
//        determines how many scores are above or equal to the average, and how many
//        scores are below the average. Enter a negative number to signify the end of the
//        input. Assume the maximum number of scores is 100.


import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 16/11/2022 
*/
public class AnalyzeScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the scores
        int[] scores = enterScore(scanner);

        // get the average value
        int average = averageValue(scores);

        // print the scores above, equal or below the average
        printTheScores(scores,average);

    }

    private static void printTheScores(int[] scores, int average) {

        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= average) {
                System.out.println(i + " which has the score of " + scores[i] + " is above or equal to average");
            } else {
                System.out.println(i + " which has the score of " + scores[i] + " is below to average");
            }
        }
    }

    private static int averageValue(int[] scores) {
        int average = 0;
        int count = 0;
        do {
            average += scores[count];
            count++;
        } while (count < scores.length);
        return average/scores.length;
    }

    private static int[] enterScore(Scanner scanner) {
        int[] scores = new int[5];
        int input;
        int count = 0;

        do {
            System.out.println("Please enter the score for " + count + ": ");
            input = scanner.nextInt();
            scores[count] = input;
            count++;
        } while (count < scores.length);

        return scores;
    }

}
