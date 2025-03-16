import java.util.*;

public class PasswordGenerator {

    //Create a method to define the structure of the passwords to be generated
    String generatePassword(int length, boolean useLowerCase, boolean useUpperCase,
                            boolean useNumbers, boolean useSpecialChars)
    {
        String lowercase = "abcdefghijklmnoprstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()?";

        StringBuilder charOptions = new StringBuilder();

        if (useLowerCase){
            charOptions.append(lowercase);
        }

        if (useUpperCase){
            charOptions.append(uppercase);
        }

        if (useNumbers){
            charOptions.append(digits);
        }

        if (useSpecialChars){
            charOptions.append(symbols);
        }

        String allChars = charOptions.toString();

        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++)
        {
            char nextLetter = allChars.charAt(rand.nextInt(allChars.length()));
            password.append(nextLetter);
        }

        return password.toString();

    }
}
