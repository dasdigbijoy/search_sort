package DataStructures;

public class SortSelection 
{ 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            }
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
    
 // Prints the array 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver code to test above 
    public static void main(String args[]) 
    { 
    	SortSelection ob = new SortSelection(); 
        int arr[] = {64,25,12,22,11}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr);
        int arr1[] = {64,25,12,22,11,15}; 
        System.out.println("Stable Selection Sorted array");
        int n=arr1.length;
        ob.stableSelection(arr1, n);
        ob.printArray(arr1);
    }

	/*
	 * Stable Selection where array Positions are changed
	 * Like selection values not being swapped, it is pushed
	 * so the order of same element remains same.
	 */
    private void stableSelection(int[] arr, int n) {
		
		for(int i=0;i<n-1; i++) {
			int min = i;
			for(int j= i+1; j<n; j++) {
				if (arr[j]<arr[min])
					min=j;
			}
			
			int k = arr[min];
			//push elements
			while(min>i) {
				arr[min] = arr[min-1];
				min--;
			}
			arr[i] = k;
		}
	} 
}
