import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayMethodsTester {
	public static void main (String[] args) {
		Random rand = new Random();
		System.out.println("Enter size of array: ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		int[] list = new int[size];
		for (int i=0; i<size; i++) {
			list[i] = rand.nextInt(50);			
		}
		System.out.println("Original Random Array: "+Arrays.toString(list)+" with size: "+size+"\n");
		ArrayMethods aM = new ArrayMethods(list);
		aM.swapFirstAndLast();
		aM.shiftRight();
		aM.evenToZero();
		aM.neighborsReplace();
		aM.middleReplace();
		aM.evenToFront();
		System.out.println("g. Second Largest: "+aM.secondLargest());
		System.out.println("h. Increasing? "+aM.increasing());
		System.out.println("i. Adjacent Duplicate? "+aM.adjDuplicate());
		System.out.println("j. Duplicate? "+aM.duplicate());
	}
	
}
