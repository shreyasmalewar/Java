//program to reverse a string in java

package datastructures;

public class JavaReverseString {
    public static void main(String[] args) {
		System.out.println(reverseString("abc"));
		System.out.println(reverseString("123!@#098*"));
	}

	public static String reverseString(String in) {
		if (in == null)
			return null;
		StringBuilder out = new StringBuilder();

		int length = in.length();

		for (int i = length - 1; i >= 0; i--) {
			out.append(in.charAt(i));
		}

		return out.toString();
	}
}