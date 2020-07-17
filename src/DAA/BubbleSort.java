package DAA;

public class BubbleSort {

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {39, 71, 85, 20, 36, 98, 05, 75};
        ob.bubbleSort(arr);
        System.out.println("Shreyas Malewar");
        System.out.println("V_B_60");        
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}