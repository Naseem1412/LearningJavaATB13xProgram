package ex_10_For_Loop;

public class Lab16_ForLopp_Continue_Even_Numbers {
    public static void main(String[] args) {
        for (int i =0; i <= 50; i++){  // 0 to 50, 51 times
            if (i%2 ==0){
                System.out.println("Even ->" +i);
                continue;
            }
            System.out.println("Odd ->"  +i);
        }
    }
}
