package ex_04_TypeCasting;

public class Lab46_Typecasting_1 {
    public static void main(String[] args) {
        int val = 300;
        // byte b = val; // Narrowing (int -> byte) - Implicit casting si not allowed.
        byte b1 = (byte) val;  // Narrowing (int -> byte) - Explicit Casting is not allowed.
// data loss.
        System.out.println(b1);
    }
}

