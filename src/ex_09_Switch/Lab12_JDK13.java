package ex_09_Switch;

public class Lab12_JDK13 {
    public static void main(String[] args) {

        int itemcode = 006;

        switch (itemcode){
            case 001 , 002,003:
                System.out.println("All them are mechanical gadget");
                System.out.println("All them are mechanical gadget");
                System.out.println("All them are mechanical gadget");
                break;
            case 004,005,006:
                System.out.println("this is mech gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
