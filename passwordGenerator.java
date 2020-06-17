import java.util.*;

public class passwordGenerator {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of the password");
        int length = in.nextInt();
        System.out.println(getPassword(length));
        in.close();
    }

    private static String getPassword(int length) {

        String number = "0123456789";
        String lowerCase = "qazwsxedcrfvtgbyhnujmiklop";
        String upperCase = "QWERTYUIOPLMKNJBHVGCFXDZSA";
        String specialSymbols = "!@$#";
        String combineCharacter = lowerCase;// if nothing is choosen then a password with only lowercase alphabets will
                                            // be genrated.

        Random rand = new Random();

        // Random method gives us the next random integer and if we give a integer as a
        // parameter than the range og the random integer becoms from 0 to the integer
        // passed.

        System.out.println("Do you want to include Uppercase alphabets (y/n)?");
        char c = in.next().charAt(0);
        if (c == 'y') {
            combineCharacter += upperCase;
        }
        System.out.println("Do you want to include number (y/n)?");
        c = in.next().charAt(0);
        if (c == 'y') {
            combineCharacter += number;
        }
        System.out.println("Do you want to include Special Symbols (y/n)?");
        c = in.next().charAt(0);
        if (c == 'y') {
            combineCharacter += specialSymbols;
        }

        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = combineCharacter.charAt(rand.nextInt(combineCharacter.length()));
        }

        return new String(password);// converts the character array into a string.
    }
}