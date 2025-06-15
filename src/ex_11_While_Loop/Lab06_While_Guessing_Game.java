package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab06_While_Guessing_Game {
    public static void main(String[] args) {
      // Guess a number between 1 and 100
        Random random = new Random();
        int numberToguess = random.nextInt(100)+1; //0 to 100
       // System.out.println(numberToguess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");


        int guess;
        int attempts =0;

        while (true){
            System.out.println("enter another guess");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToguess){
                System.out.println("Too low, try again");


            }else if (guess > numberToguess){
                System.out.println("Too high, try again");

            }else {
                System.out.println("Correct! Your guessed it in" +attempts ++);
                break;
            }
        }
    }
}
