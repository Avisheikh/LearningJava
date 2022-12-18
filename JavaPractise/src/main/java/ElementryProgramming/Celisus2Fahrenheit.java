package ElementryProgramming;

import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 12/12/2022 
*/
public class Celisus2Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter the Celsius");
//        double celsius = scanner.nextDouble();
//        double fahrenheit = (9.0/5) * celsius + 32;
//        System.out.println(celsius+" Celsius is " + fahrenheit + " fahrenheit");

        System.out.println("Enter foot: ");
        double foot = scanner.nextDouble();
        double meters = foot * 0.305;
        System.out.println(meters);
    }

}
