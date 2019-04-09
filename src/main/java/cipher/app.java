package cipher;

import java.util.Scanner;
import static cipher.encrypt.encrypt;
//import static cipher.decrypt.decrypt;

public class app {

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Word");
        String text = myScanner.nextLine();

        System.out.println("Enter Key number");
        int key = myScanner.nextInt();
        myScanner.nextLine();


        System.out.println("The Encrypted word is " + encrypt(text, key));
//        System.out.println("================================================");
//
//        System.out.println("Enter Word");
//        text = myScanner.nextLine();
//
//        System.out.println("Enter Key number");
//        key = myScanner.nextInt();
//        myScanner.nextLine();
//
//        System.out.println("The Decrypted word is " + decrypt(text, key));
    }
}