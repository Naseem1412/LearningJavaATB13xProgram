package ex_05_Ternary_Operator;

public class Lab54_To_Three_Max {
    public static void main(String[] args) {
        // Find the maximum the 3 numbers.
        // Logic building formula
int n1 = 2;
int n2 = 9;
int n3 = -11;

        //Step 1 :Find input/output
        //I/O ->n1,n2,n3 -int
        //O/P -> String -> max number

        //step 2 -Rough Logic, think about it
        // n1 > n2 and n1 >n3 -> n1
        // n1 > n3 and n2 >n3 -> n2
        // n3

        // step 3
        int max = (n1>n2)? (n1>n3) ? n1 : n3 : (n2>n3) ? n2: n3;

        // A-> (n1>n3) ? n1 : n3
        // B -> (n2>n3) ? n2 : n3
        System.out.println(max);
        }
}
