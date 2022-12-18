package ElementryProgramming;

import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 18/12/2022 
*/
public class Lottery {
    public static void main(String[] args) {
        int lotteryNumber = (int) (Math.random()*100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your two digit number");
        int guess = scanner.nextInt();

        // lottery Number
        int lotteryNumber1 = lotteryNumber / 10;
        int lotteryNumber2 = lotteryNumber % 10;

        // Guess number
        int guessNumber1 = guess / 10;
        int guessNumber2 = guess % 10;

        System.out.println("The lottery number is: " + lotteryNumber);

        //check the guess
        if (lotteryNumber == guess) {
            System.out.println("Exact match: you win $10,000");;
        } else if (lotteryNumber1 == guessNumber2 && guessNumber1 == lotteryNumber2) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessNumber1 == lotteryNumber1 || guessNumber2 == lotteryNumber2
                || lotteryNumber1 == guessNumber2
                || guessNumber1 == lotteryNumber2 ) {
            System.out.println("Match one digit: you win $1,000");
        } else  {
            System.out.println("Sorry Mother fuckers. You have lost.");
        }



//        boolean isGenerateNumber = String.valueOf(generateNumber).length() == 1;
//        boolean isLotteryNumber = String.valueOf(lotteryNumber).length() == 1;
//
//        if (isGenerateNumber) {
//            String number = 0+String.valueOf(generateNumber);
//            generateNumber = Integer.parseInt(number);
//        }
//        if(isLotteryNumber) {
//            String number = 0+String.valueOf(lotteryNumber);
//            lotteryNumber = Integer.parseInt(number);
//        }

    }
}
