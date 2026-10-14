package com.Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n(any + integer): ");
        int n = in.nextInt();

        // 1. Create a dynamic list to store the string results
        List<String> output = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                output.add("FizzBuzz");
            } else if(i % 3 == 0) {
                output.add("Fizz");
            } else if(i % 5 == 0) {
                output.add("Buzz");
            } else {
                // 2. Convert the integer 'i' to a string before adding it
                output.add(String.valueOf(i));
            }
        }

        // 3. Print the final list matching your required format
        System.out.println("Output: " + output);
    }
}
