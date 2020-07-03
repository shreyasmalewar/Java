package DAA;

public class BinarySearch {
    int BSearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int middle = l + (r - l) / 2; 
  
          
            if (arr[middle] == x) 
                return middle; 

            if (arr[middle] > x) 
                return BSearch(arr, l, middle - 1, x); 
  
            return BSearch(arr, middle + 1, r, x); 
        } 
        return -1; //flag variable
    } 
  
    public static void main(String args[]) 
    { 
        BinarySearch B = new BinarySearch(); //
        int arr[] = { 10, 23, 25, 45, 50, 69, 73 }; 
        int n = arr.length; 
        int x = 69; 
        int result = B.BSearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}