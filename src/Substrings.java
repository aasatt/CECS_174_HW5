//Homework Problem #1
import java.util.Scanner;

public class Substrings {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = input.next();
		
		for(int i = 1; i <= word.length(); i++) {
			for (int j = 1; j <= word.length()-i+1; j++) {
				System.out.println(word.substring(j-1, j+i-1));
			}
		}
	}
}
