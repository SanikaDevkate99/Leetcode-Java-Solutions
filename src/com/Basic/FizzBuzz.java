package com.Basic;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n(any + integer): ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + " ");
            if ((i%3==0) && (i%5==0)){
                System.out.println("FizzBuzz");
            } else if(i%3==0) {
                System.out.println("Fizz");
            } else if(i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }
}
