import java.util.*;

public class PasswordGenerator {

    //Create a method to define the structure of the passwords to be generated
    String generatePassword(int length, boolean useLowerCase, boolean useUpperCase,
                            boolean useNumbers, boolean useSpecialChars)
    {
        String lowercase = "abcdefghijklmnoprstuvwxyz";
        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++)
        {
            char nextLetter = lowercase.charAt(rand.nextInt(lowercase.length()));
            password.append(nextLetter);
        }

        return password.toString();

    }
}
