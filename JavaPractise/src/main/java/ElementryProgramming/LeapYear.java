package ElementryProgramming;

import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 18/12/2022 
*/
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter to check the year is leap year or not");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
