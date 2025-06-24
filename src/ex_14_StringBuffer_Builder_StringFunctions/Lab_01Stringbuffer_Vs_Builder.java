package ex_14_StringBuffer_Builder_StringFunctions;

public class Lab_01Stringbuffer_Vs_Builder {
    public static void main(String[] args) {
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");



        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}

