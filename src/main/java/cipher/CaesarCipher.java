import java.util.Scanner;

class CaesarCipher
{
    // Encrypts text using a shift od s 
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code 
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