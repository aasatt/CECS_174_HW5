<<<<<<< HEAD
import java.util.Scanner;

public class Substrings {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("This program will read a word and print all substring, sorted by length");
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.print("Enter a word: ");
		String word = input.next();
		
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.substring(i, i+1));
			while(i < word.length()){
				
=======
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
>>>>>>> origin/master
			}
		}
	}
}
