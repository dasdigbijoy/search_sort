package DataStructures;

public class SortMergeSort {

	public static void main(String ar[]) {
		SortMergeSort ms = new SortMergeSort();
		//int array[] = { 6, 5, 12, 10, 9, 1 };
		int array[]= {8, 7, 2, 1, 4, 9, 6};
		// print
		System.out.println(" Before Merge ");
		ms.print(array);
		
		ms.mergeSort(array, 0, array.length - 1);
		System.out.println(" After Merge ");
		// Print
		ms.print(array);
	}

	// Divide into sub-array sort and merge them
	private void mergeSort(int[] array, int l, int r) {
		if(l<r) {
			int mid = (l + r) / 2;

			// call divide
			mergeSort(array, l, mid);
			mergeSort(array, mid + 1, r);
			merge(array, l, mid, r);

		}

	}

	// It's time to merge
	private void merge(int[] array, int p, int q, int r) {
		// Array [p..r] -> original
		int n1 = (q - p) + 1;
		int n2 = r - q;
		int[] L = new int[n1];
		int[] R = new int[n2];
        
		// Fill left and right arrays
		// i-> left array, j-> right array, k-> original array
		for (int i = 0; i < n1; i++) {
			L[i] = array[p+i];
		}
		
		for (int j = 0; j < n2; j++) {
			R[j] = array[q+1+j];
		}
		//Track of left [i], right[j] and the final array K
		int i=0;
		int j=0;
		int k=p;
		
		while(i<n1 && j<n2) {
			if(L[i] <= R[j] ) {
				array[k] = L[i];
				i++;
				k++;
			} else {
				array[k] = R[j];
				j++;
				k++;
				
			}
		}
		
		//end of element of left array, pick up the remaining
		while(i<n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		
		//end of element of right array, pick up the remaining
		while(j<n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}
	
	void print(int [] array) {
		
		for(int i=0;i<array.length;i++) {
			System.out.print("  "+array[i]);
		}
		
		System.out.println();
	}
}
