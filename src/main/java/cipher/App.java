package cipher;

import java.util.Scanner;
import

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Word");
        String text = myScanner.nextLine();

        System.out.println("Enter Key number");
        int s = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("The Encrypted word and key are " + encrypt(text, s));
    }
}
