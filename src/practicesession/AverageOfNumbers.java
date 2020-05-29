//Program to calculate average of all numbers inserted

package practicesession;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the total number of integers.");
		int count = scanner.nextInt();

		int sum = 0;


		//User entered numbers
		for (int i = 0; i < count; i++) {
			System.out.println("Please enter number " + (i + 1) + ":");
			sum += scanner.nextInt();
		}
		System.out.println("Sum=" + sum + ",Count=" + count);

		BigDecimal average = new BigDecimal((double) sum / count);
		average = average.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Average of entered numbers = " + average);
		scanner.close();
	}
}