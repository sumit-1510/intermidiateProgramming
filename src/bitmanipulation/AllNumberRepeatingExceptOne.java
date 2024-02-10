package bitmanipulation;

public class AllNumberRepeatingExceptOne {
    public static void main(String[] args) {
        // Initializing the array
        int[] arr = {1, 2, 3, 2, 1};

        // Initializing result variable to 0
        int result = 0;

        // Looping through the array elements
        for (int i : arr) {
            // Using XOR operation
            result ^= i;
        }

        // Printing the required number to the console
        System.out.println(result);
    }
}