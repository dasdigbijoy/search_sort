package DataStructures;

//Java implementation of recursive Binary Search 
public class BinarySearch { 
 // Returns index of x if it is present in arr[l.. 
 // r], else return -1 
int count=0;	
 int binarySearch(int arr[], int first, int last, int x) 
 { 
	 System.out.println(" l is "+ first + " and r is "+last);
	 
	 if (last>=first) { 
		 int mid = first + (last - first)/2;  

         // If the element is present at the 
         // middle itself 
         if (arr[mid] == x) {
        	 //Here there might be
        	 count++;
        	 //it might be left or right; can do the logic here.
        	 return mid;
         }
              

         // If element is smaller than mid, then 
         // it can only be present in left subarray 
         if (arr[mid] > x) 
             return binarySearch(arr, first, mid - 1, x); 

         // Else the element can only be present 
         // in right subarray 
         return binarySearch(arr, mid + 1, last, x); 
     } 

     // We reach here when element is not present 
     // in array 
     return -1; 
 } 

 // Driver method to test above 
 public static void main(String args[]) 
 { 
     BinarySearch ob = new BinarySearch(); 
     int[] arr = {2, 3, 4, 10, 10, 10, 40, 50, 55, 60 };
   //  int arr[] = {12, 12, 12, 12, 12, 12, 12, 12, 12, 12 };
     int n = arr.length; 
     int midcount =0;
     int x = 3; 
     int count=0;
     int result = ob.binarySearch(arr, 0, n - 1, x); 
     if (result == -1)  
         System.out.println("Element not present"); 
         
     else {
    	 count++;
    	 midcount = result;
    	 System.out.println("Element found at indexes " + result); 
     }
        
     	 
     
     //Finding no. of K elements go left until present
     while (count>0 && result>0 && arr[result-1] == x) {
    	 count++;
    	 result--;
     }
     result = midcount;
     //Finding no. of K elements go left until present
     while (count>0 && result<n-1 && arr[result+1] == x) {
    	 count++;
    	 result++;
     }
     
     if(midcount>0) {
    	 System.out.println("Element found at index " + midcount + " And prsent "+count+" times"); 
     }
     
 }



} 
