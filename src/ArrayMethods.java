import java.util.Arrays;



public class ArrayMethods {
	private int[] values;

	public ArrayMethods (int[] initialValues){
		this.values = initialValues;
	}
	public void swapFirstAndLast() {
		int[] temp = Arrays.copyOf(values, values.length);
		int a = temp[0];
		int z = temp[temp.length-1];
		temp[0] = z;
		temp[temp.length-1] = a;
		System.out.println("a. "+Arrays.toString(temp));
	}
	public void shiftRight() {
		int[] temp = Arrays.copyOf(values, values.length);
		int endValue = values[values.length-1];
		for (int i = temp.length-1; i>=0; i--) {
			if (i!=0)
				temp[i] = values[i-1];
			else
				temp[0] = endValue;
			
		}
		System.out.println("b. "+Arrays.toString(temp));
	}
	public void evenToZero() {
		int[] temp = Arrays.copyOf(values, values.length);
		for (int i = 0; i<temp.length; i++) {
			if (temp[i]%2==0)
				temp[i] = 0;			
		}
		System.out.println("c. "+Arrays.toString(temp));
	}
	public void neighborsReplace() {
		int[] temp = Arrays.copyOf(values, values.length);
		for (int i = 1; i<temp.length-1; i++) {
			if (values[i-1]>values[i+1])
				temp[i] = values[i-1];
			else
				temp[i] = values[i+1];
		}
		System.out.println("d. "+Arrays.toString(temp));
	}
	public void middleReplace() {
		
		if (values.length%2==0) {
			int[] temp = new int[values.length-2];
			int count = 0;
			for (int i = 0; i<values.length; i++) {
				if (!(i == values.length/2 || i == (values.length/2)-1)) {
					temp[count] = values[i];
					count++;
				}
			}
			System.out.println("e. "+Arrays.toString(temp));
		}
		else {
			int[] temp = new int[values.length-1];
			int count = 0;
			for (int i = 0; i<values.length; i++) {
				if (i != (values.length-1)/2) {
					temp[count] = values[i];
					count++;
				}
			}
			System.out.println("e. "+Arrays.toString(temp));
		}
	}
	public void evenToFront() {
		int[] temp = Arrays.copyOf(values, values.length);
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i<temp.length; i++) {
			if (values[i]%2==0) {
				temp[evenCount] = values[i];
				evenCount++;
			}
		}
		for (int i = 0; i<temp.length; i++) {
			if (values[i]%2!=0) {
				temp[evenCount+oddCount] = values[i];
				oddCount++;
			}
		}
		
		System.out.println("f. "+Arrays.toString(temp));
	}
	public int secondLargest() {
		int secondLargest = values[0];
		int largest =  values[0];
		for (int i = 0; i<values.length; i++) {
			if (values[i]>largest) {
				largest = values[i];
			}
		}
		int start=0;
		if ((int)largest == (int)values[0])
			secondLargest = values[1];
		
		for (int i = start; i<values.length; i++) {
			if ((values[i]!=(int)largest)) {
				if (values[i]>secondLargest)
				secondLargest = values[i];
			}
		}
		return secondLargest;
	}
	public boolean increasing() {
		for (int i = 0; i<values.length-1; i++) {
			if (!(values[i]<=values[i+1]))
				return false;
			
		}	
		return true;
	}
	public boolean adjDuplicate() {
		for (int i = 0; i<values.length-1; i++) {
			if ((values[i]==values[i+1]))
				return true;
			
		}	
		return false;
	}
	public boolean duplicate() {
		for (int i = 0; i<values.length-1; i++) {
			for (int j = i+1; j<values.length; j++)
			if ((values[i]==values[j]))
				return true;
			
		}	
		return false;
	}
}
