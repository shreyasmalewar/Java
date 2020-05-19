package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DeleteFromList {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter comma separated list of Strings. For example 'a,b,c,b,a'");
		String input = scanner.next();
		System.out.println("Enter String to remove from the input list.");
		String strToDelete = scanner.next();
		scanner.close();

		List<Object> inputList = new ArrayList<>();
		String[] inputStrings = input.split(",");
		for (String s : inputStrings)
			inputList.add(s.trim());
		
		inputList = removeAll(inputList, strToDelete);
		System.out.println("Result List = "+inputList);
	}

	private static List<Object> removeAll(List<Object> inputList, Object objToDelete) {
		Iterator<Object> it = inputList.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj.equals(objToDelete)) it.remove();
		}
		return inputList;
	}
}