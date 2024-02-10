package bitmanipulation;

import java.util.Scanner;

public class CheckIthBitSetOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        int i=3;
        System.out.println("You entered: " + number);
        int i1 = number & (1 << i);
        if (i1 != 0) {
            System.out.println("The ith bit is set");
        } else {
            System.out.println("The ith bit is not set");
        }
    }
}