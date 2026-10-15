package com.Basic;
import java.util.Scanner;

public class PalindromeNum {
    public boolean isPalindrome(int x) {
        // Special cases:
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revHalf = 0;
        // Reverse the second half of the digits until it meets or exceeds the first half
        while (x > revHalf) {
            revHalf = (revHalf * 10) + (x % 10);
            x /= 10;
        }

        // For even length numbers: x == revHalf
        // For odd length numbers: drop the middle digit via revHalf / 10 and compare
        return x == revHalf || x == revHalf / 10;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PalindromeNum solver = new PalindromeNum();

        // Let's test it with a sample number
        int testNumber = in.nextInt();
        boolean result = solver.isPalindrome(testNumber);

        System.out.println("Is " + testNumber + " a palindrome? " + result);
    }
}

