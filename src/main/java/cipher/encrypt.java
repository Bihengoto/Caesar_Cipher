//package cipher;
//
//public class encrypt {
//    public static String encrypt(String text, int key)
//    {
//        String result= "";
//
//        for (int i=0; i<text.length(); i++)
//        {
//            if (Character.isUpperCase(text.charAt(i)))
//            {
//                char ch = (char)(((int)text.charAt(i) +
//                        key - 65) % 26 + 65);
//                result += ch;
//            }
//            else if (Character.isLowerCase(text.charAt(i)))
//            {
//                char ch = (char)(((int)text.charAt(i) +
//                        key - 97) % 26 + 97);
//                result += ch;
//            } else {
//                char ch = (char)((int)text.charAt(i));
//                result += ch;
//            }
//        }
//        return result;
//    }
//}
