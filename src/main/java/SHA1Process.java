import java.math.BigInteger;
import java.security.MessageDigest;  //MessageDigest class is used to calculate cryptographic hashing value

public class SHA1Process {

    public static String sha1(String input) throws Exception {
        try {

            //getInstance argument is "SHA-1" - to use sha-1 algorithm
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");

            // digest() - calculate value of message shortcut
            byte[] shortcut = messageDigest.digest(input.getBytes());

            //shortcut - byte array of calculation results (there are 20 numbers in array)

            //convert byte array to signum representation - odd math function that extracts the sign of a real number (48 chars)
            BigInteger bigInteger = new BigInteger(1, shortcut);

            // convert to hexadecimal format
            StringBuilder hash = new StringBuilder(bigInteger.toString(16));

            // If hash has fewer chars then 32, add zeros to make 32 bits
            while (hash.length() < 32) {
                hash.insert(0, "0");
            }

            return hash.toString();
        }

        catch (Exception e) {
            throw new Exception(e);
        }
    }
}
