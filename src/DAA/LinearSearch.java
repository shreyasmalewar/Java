package DAA;

public class LinearSearch {
    public static int LS(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String a[]) {
        int[] array = { 39, 25, 87, 23, 85, 100, 27, 50 };
        int key = 85;
        System.out.println(key + " is found at index: " + LS(array, key));
    }
}