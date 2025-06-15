package ex_09_Switch;

import java.util.Scanner;

public class Lab04_Real_switch_automation {
    public static void main(String[] args) {
        // Web automation
        //I will ask the user to give met he input from browser which he wants to
        // use to will start the automation in that browser.


        // string browser = args[0];
        //System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser, which you want to start!!");
        String browser = scanner.next();

        switch (browser){
        case "chrome":
        System.out.println("Starting the chrome");
        System.out.println(".....");
        System.out.println("TC1");
        System.out.println("TC2");
        break;

        case "firefox":
        System.out.println("Starting the firefox browser");
        // Further ncode to start the Firefox
        //Webdriver driver = new firfox();  // Selenium code
        break;
        case "edge":
        System.out.println("Execute the Edge code");
        default:
        System.out.println("I have no idea which browser is this");
        break;

    }
}
}