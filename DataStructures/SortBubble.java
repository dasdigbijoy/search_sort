package DataStructures;

public class SortBubble {

	public static void main(String[] args) {
		int[] array = { -2, 45, 0, 11, -9 };
		SortBubble bs = new SortBubble();
		System.out.println(" The array is ");
		bs.printArray(array);
		bs.sort(array);		
		System.out.println("After Bubble Sort ");
		bs.printArray(array);

	}

	private void sort(int[] array) {
		int len = array.length;

		// Traverse through sort...
		for (int i = 0; i < len-1; i++) {
			boolean swapped = false;
			for (int j = 0; j < len-i-1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
