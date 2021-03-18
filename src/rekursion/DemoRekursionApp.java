package rekursion;

import java.util.Locale;

public class DemoRekursionApp {
    public static void main(String[] args) {

        System.out.println("isPalindrom(\"Anna\") = " + isPalindrom("Anna"));
        System.out.println("isPalindrom(\"Reliefpfeiler\") = " + isPalindrom("Reliefpfeiler"));
        System.out.println("isPalindrom(\"Was it a car or a cat I saw\") = " + isPalindrom("Was it a car or a cat I saw"));
        System.out.println("isPalindrom(\"2002\") = " + isPalindrom("2002"));
        System.out.println("isPalindrom(\"Hugo\") = " + isPalindrom("Hugo"));


    }
    public static boolean isPalindrom(String text) {

        text = text.toLowerCase(Locale.ROOT);
        text = text.replace(" ", "");

        char firstCharacter = text.charAt(0);
        char lastCharacter = text.charAt(text.length() - 1);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);
        System.out.println("-----");

        if (firstCharacter == lastCharacter) {

            text = text.substring(1,text.length() - 1);
            //System.out.println(text);
            if (text.length() <= 1)
                return true;

            return isPalindrom(text);
        } else {

            return false;
        }
    }
}
