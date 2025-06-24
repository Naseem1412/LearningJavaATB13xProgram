package ex_14_StringBuffer_Builder_StringFunctions;

public class LAB04_Sbuilder {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse();
        System.out.println(sb);

    }
}
