//Sorting an array in java

package practice;

import java.util.Arrays;

public class JavaArraySort {
    public static void main(String[] args) {
		int[] array = {2,1,5,3,4,6,7};

		int[] sortedArray = bubbleSortAscending(array);
		
		System.out.println(Arrays.toString(sortedArray));
	}

	public static int[] bubbleSortAscending(int[] arr){
        int temp;
        for(int i=0; i < arr.length-1; i++){
             
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            //check that last index has highest value in first loop,
            // second last index has second last highest value and so on
            System.out.println("Array after "+(i+1)+"th iteration:"+Arrays.toString(arr));
        }
        return arr;
    }
}