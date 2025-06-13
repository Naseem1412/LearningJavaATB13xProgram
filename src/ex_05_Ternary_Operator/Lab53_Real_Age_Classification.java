package ex_05_Ternary_Operator;

public class Lab53_Real_Age_Classification {
    public static void main(String[] args) {
        //age =23
        //age < 18 -> Minor
        // 18 < age> 65 -> Adult
        // age >65 -> Senior citizen

        int age =23;
        String result = (age < 18) ? "Minor":(age <65)?  "Adult":"Senior";
        System.out.println(result);}
}
