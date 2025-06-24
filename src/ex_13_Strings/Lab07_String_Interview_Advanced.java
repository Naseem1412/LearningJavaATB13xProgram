package ex_13_Strings;

import java.sql.SQLOutput;

public class Lab07_String_Interview_Advanced {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "Hello";


        String s3 = new String("HEllo");  //OA
        String s4 = new String("HEllo");
        String s5 = new String("HEllo");// OA =3

        // == -> Comparsion -> String -> This check the locations ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s5);


        // equal (content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    // == -> check fot the ref
        // =   -> assignment the value
    }
}
