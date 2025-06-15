package ex_11_While_Loop;

import java.util.Scanner;

public class Lab05_WHile_IQ_Factorial {
    public static void main(String[] args) {
        //Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the number!");
        int number = scanner.nextInt();

        int factorial = 1;
        if (number <= 0) {
            System.out.println(factorial);
        } else {
            //Calculate the factorial
            for (int i = 1; i <= number; i++) {
                factorial = factorial * 1;

            }
        }
    }
}
