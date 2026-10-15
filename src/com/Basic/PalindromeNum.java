package com.Basic;

import java.util.Scanner; // Required to read user input

public class PalindromeNum {

    // YOUR BRUTE FORCE APPROACH
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        char[] digits = String.valueOf(x).toCharArray();
        int left = 0;
        int right = digits.length - 1;

        while (left < right) {
            if (digits[left] != digits[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // MAIN METHOD WITH USER INPUT
    public static void main(String[] args) {
        PalindromeNum solver = new PalindromeNum();

        // Create a Scanner object attached to system input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to check: ");

        // Check if the user actually typed an integer to avoid crashing
        if (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();

            boolean result = solver.isPalindrome(userInput);

            System.out.println("Is " + userInput + " a palindrome? -> " + result);
        } else {
            System.out.println("Error: Please enter a valid integer number next time.");
        }

        // Close the scanner resource
        scanner.close();
    }
}
