package Array.ProgrammingExercises;


//(Assign grades) Write a program that reads student scores, gets the best score, and
//        then assigns grades based on the following scheme:
//        Grade is A if score is Ú best -10;
//        Grade is B if score is Ú best -20;
//        Grade is C if score is Ú best -30;
//        Grade is D if score is Ú best -40;
//        Grade is F otherwise.
//        The program prompts the user to enter the total number of students, then prompts
//        the user to enter all of the scores, and concludes by displaying the grades. Here is
//        a sample run:

import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 13/11/2022 
*/
public class AssignGrades {

    public static void main(String[] args) {
        //Enter total number of students
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the total number of students: ");
        int studentTotalNumber = scanner.nextInt();

        //Enter the scores of the students
        int[] scores = getStudentScores(scanner, studentTotalNumber);

        //Find the best scores
        int bestScore = getBestScore(scores);

        //Assign char
        char[] grades = getGrade(scores, bestScore);

        // Display results
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " +
                    scores[i] + " and grade is " + grades[i]);
        }
    }

    private static char[] getGrade(int[] scores, int bestScore) {
        char[] grades = new char[scores.length];

        for (int i =0; i < grades.length;i++) {

            if (scores[i] >= bestScore-10) {
                grades[i] = 'A';
            } else if (scores[i] >= bestScore-20) {
                grades[i] = 'B';
            } else if (scores[i] >= bestScore-30) {
                grades[i] = 'C';
            }
            else if (scores[i] >= bestScore-40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        return grades;
    }

    private static int getBestScore(int[] scores) {
        int bestScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (bestScore < scores[i]) {
                bestScore = scores[i];
            }
        }
        return bestScore;
    }

    private static int[] getStudentScores(Scanner scanner, int studentTotalNumber) {
        int[] scores = new int[studentTotalNumber];
        for(int i=0; i < scores.length; i++) {
            System.out.println("Please enter the scores of students " + i +": ");
            scores[i] = scanner.nextInt();
        }
        return scores;
    }
}
