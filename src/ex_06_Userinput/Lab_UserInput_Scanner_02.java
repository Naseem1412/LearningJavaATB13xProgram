package ex_06_Userinput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);

        System.out.println("Enter the int");
        int int_input = scanner.nextInt();
        System.out.println(int_input);

        System.out.println("Enter the Double ");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);
    }
}
