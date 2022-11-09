package Array;

/*
    Author       :- Avi-sheikh 
    Created Date :- 09/11/2022 
*/
public class CountLettersInArray {

    public static void main(String[] args) {

        // Declare and create an array
        char[] chars = createArray();

        // Display the array
        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        // Count the occurrence of the letters
        int[] counts = countLetters(chars);

        // Display the count
        System.out.println();
        System.out.println("The occurrence of letters are:");
        displayCounts(counts);
    }

    private static char[] createArray() {

        char[] chars = new char[100];

        for(int i=0; i < chars.length; i++) {
            chars[i] = getRandomLowerCaseLetter();
        }
        return chars;
    }

    private static void displayArray(char[] chars) {
        for(int i = 0; i < chars.length; i++) {
            if((i + 1) % 20 == 0){
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    private static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for(int i=0; i < chars.length;i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    private static void displayCounts(int[] counts) {
        for (int i=0; i < counts.length; i++) {
            if((i + 1) % 10 == 0) {
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            } else {
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
            }
        }
    }

    private static char getRandomLowerCaseLetter() {
        char ch1 = 'a';
        char ch2 = 'z';
        return (char) (ch1 + Math.random() *(ch2 - ch1 + 1 ));
    }

}
