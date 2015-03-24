import java.util.Scanner;



public class PrimeNumbers {
	public static void main (String[] args) {
		System.out.println("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		PrimePrinter pP = new PrimePrinter(n);
	}
}

class PrimePrinter {
	
	public PrimePrinter(int n) {
		PrintGenerator pGen = new PrintGenerator(n);
		int primeNum = pGen.nextPrime();
		while (primeNum < n) {
			System.out.print(primeNum+" ");
			primeNum = pGen.nextPrime();
		}
	}
}

class PrintGenerator {
	private int n = 0;
	private int count = 2;
	public PrintGenerator(int input) {
		n = input;
	}
	public int nextPrime() {
		while (!this.isPrime(count) && count<n) {
			count++;
		}
		count++;
		return count-1;
	}
	public boolean isPrime(int test) {
		for (int i=2; i<test; i++) {
			if (test%i == 0) {
				return false;
			}
		}
		return true;
	}

}