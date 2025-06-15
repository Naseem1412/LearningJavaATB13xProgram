package ex_10_For_Loop;

public class Lab15_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i == 5) {

                continue;  //skip the code and move to next to top

            }
            System.out.println(i);
        }
    }
}

