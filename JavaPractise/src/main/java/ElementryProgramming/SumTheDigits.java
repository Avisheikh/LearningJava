package ElementryProgramming;


import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 12/12/2022 
*/
public class SumTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value from 0 to 999");
        int num = scanner.nextInt();
        int a = num % 10;
        num /= 10;
        int b = num % 10;
        num /= 10;
        int c = num % 10;
        System.out.println(a+b+c);
    }
}
