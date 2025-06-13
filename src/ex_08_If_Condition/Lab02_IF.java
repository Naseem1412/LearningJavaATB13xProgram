package ex_08_If_Condition;

import java.util.Scanner;

public class Lab02_IF {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scammer = new Scanner(System.in);
        int age = scammer.nextInt();


        if (age > 18){
            System.out.println("Allowed to vote");

        }else
            System.out.println("Not allowed to vote");
    }
}
