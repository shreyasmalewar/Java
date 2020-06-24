//Program to convert charecter to string

package practice;

class chartostring {
    public static void main(String args[]) {
        // charat() method has been used
        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Character at " + i + " Position: " + ch);
        }
    }
}