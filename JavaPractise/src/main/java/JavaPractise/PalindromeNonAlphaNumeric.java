package JavaPractise;

import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 07/11/2022 
*/
public class PalindromeNonAlphaNumeric {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println("Igonring nonalphanumeric characters, " + s + "a palindrome? " + isPalindrome(s));
    }

    private static Boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s2.equals(s1);
    }

    private static String filter(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i < stringBuilder.length(); i ++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    private static String reverse(String s1) {
        StringBuilder stringBuilder = new StringBuilder(s1);
        return stringBuilder.reverse().toString();
    }
}
