package Programs_by_MKT;

import java.util.Scanner;

public class ReverseOneStringFromGivenTwoString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String word1 = scan.next();

        System.out.println("Enter the second word:");
        String word2 = scan.next();

        String reversedWord2 = reverseWord(word2);

        System.out.println(word1 + " " + reversedWord2);
    }

    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;

	}

}
