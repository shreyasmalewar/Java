//program to concatenate string

package practice;

import java.util.Scanner;

public class ReadStringConcat {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Strings to Concatenate:");
		int n = scanner.nextInt();
		
		String[] input = new String[n];
		for(int i=0; i<n; i++) {
			System.out.println("Please enter String number "+n+" and press enter:");
			input[i] = scanner.next();
		}
		//close Scanner and avoid resource leak
		scanner.close();
		String output = concat(input);
		System.out.println("Concatenation Result = "+output);
	}

	private static String concat(String[] input) {
		StringBuilder sb = new StringBuilder();
		for(String s : input) sb.append(s);
		return sb.toString();
	}
}