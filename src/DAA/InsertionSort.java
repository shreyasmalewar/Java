package DAA;

public class InsertionSort {

    public static void main(String args[]) 
    { 
        int arr[] = {39, 71, 85, 20, 36, 98, 05, 75}; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.sort(arr); 
        System.out.println("Shreyas Malewar");
        System.out.println("V_B_60");
        printArray(arr); 
    } 
    
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 

    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
}