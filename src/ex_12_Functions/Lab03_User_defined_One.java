package ex_12_Functions;

public class Lab03_User_defined_One {
    public static void main(String[] args) {
int result = sum_of_number(3 , 4);

        System.out.println(result);
    }
    static int sum_of_number(int a, int b){
        return a + b;
    }
    static void sum_0f_number_no_return(int a, int b){
        System.out.println(a+b);
    }
}
