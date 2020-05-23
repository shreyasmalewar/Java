//program to remove odd numbers

package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveOddNumbers {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter comma separated numbers for input int array, for example '1,2,3,4'");
		String input = scanner.next();
		scanner.close();
		//convert to int array
		String[] inArray = input.split(",");
		int [] intArray = new int[inArray.length];
		int index = 0;
		for(String s : inArray) {
			intArray[index] = Integer.parseInt(s.trim());
			index++;
		}
		//call a function to remove odd numbers
		Integer[] result = removeOddNumbers(intArray);
		
		System.out.println(Arrays.toString(result));
	}

	private static Integer[] removeOddNumbers(int[] intArray) {
		//we will have to use list because we don't know exact size of the result array
		List<Integer> list = new ArrayList<>();
		for(int i : intArray) {
			if(i%2 == 0) list.add(i);
		}
		
		return list.toArray(new Integer[list.size()]);
	}
}