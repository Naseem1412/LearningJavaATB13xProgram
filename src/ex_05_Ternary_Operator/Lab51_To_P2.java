package ex_05_Ternary_Operator;

public class Lab51_To_P2 {
    public static void main(String[] args) {
        // The minimum number two numbers by using ternary operator.
         int x = 10;
         int y = 20;
        //System.out.println(Math.min(x,y));

        int min =x < y ? x : y;
        System.out.println(min);

    }
}
