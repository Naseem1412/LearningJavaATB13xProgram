package ex_03_Operators;

public class Lab37_interview {
    public static void main(String[] args) {
        int naseema_salary = 25;
        boolean b = !(naseema_salary  > 23 || naseema_salary < 15);
        System.out.println(b);
        // A -> naseema_slary > 23 -> 25 > 23 ->true
        // b -> naseema_slary > 15 -> 25 < 15 -> false
        // (A || B) -> !(true ||false) -> true - false


    }
}
