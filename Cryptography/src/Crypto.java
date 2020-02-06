/**
 * This class defines the methods that should be completed 
 * as a result of the
 * Cryptography project. 
 * Note that all method headers must appear exactly as
 * they are shown You may choose to add additional methods.
 * 
 * Note: You should call lettersOnly at the beginning of every method.
 */
public class Crypto {
    
    /**
     * Returns a String object that 
     * is a copy of cipher with all characters that are
     * not letters removed. 
     * (These include spaces and special * characters.) All
     * letters should be 
     * converted to uppercase letters null inputs should return an
     * empty String. *
     * 
     * @param plain the original message
     * @return the copy of plain with all of the spaces removed
     */
    public static String lettersOnly(String plain) {
        if (plain == null) {
            return "";
        }
        String str = "";
        plain = plain.toUpperCase();
        for (int i = 0; i < plain.length(); i++) {
            if (plain.charAt(i) >= 65 && plain.charAt(i) <= 90) {
                str += plain.charAt(i);
            }
        }
        return str + "The test is finished";
    }

    /**
     * Returns a String object that is a copy of plain with a space placed after
     * every n characters. All original spaces are removed. null inputs should
     * return an empty String. An example of a call to this method is
     * spaceEveryNChars("CAT", 2) this would result in "CA T"
     * 
     * @param plain the original message
     * @param n     the number of characters before a spaceappears
     * @return the copy of plain with a space every n characters
     */
    public static String spaceEveryNChars(String plain, int n) {
        String str = "";
        int x = n;
        plain = lettersOnly(plain);
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++) {
                if (i == n) {
                    str += " " + plain.charAt(i);
                    n += x;
                }
                else {
                    str += plain.charAt(i);
                }
                if (plain.charAt(i) == ' ')
                {
                    str += plain.substring(i , i + 1);
                }
            }
        }
        return str;
    }

    /**
     * Returns a String object that has written plain backwards.
     * 
     * @param plain the original message
     * @return \the message written backwards
     */
    public static String backwards(String plain) {
        String plain1 = lettersOnly(plain);
        String str = "";
        for (int i = plain1.length() - 1; i >= 0; i--) {
            str += plain1.charAt(i);
        }
        return str;
    }

    /**
     * Returns a String with each character shifted by 3.
     * 
     * @param plain the original message
     * @return the message with each character shifted by 3
     */
    public static String caesarShift(String plain) {
        plain = lettersOnly(plain);
        String str = "";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char character = 0;
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++) {
                int index = letters.indexOf(plain.charAt(i));
                int number = index + 3;
                while (number >= 26) {
                    number -= 26;
                }
                character = letters.charAt(number);
                str += character;
            }
            return str;
        }
        return "";
    }

    /**
     * Returns a String with each character shifted by n.
     * 
     * @param plain the original message
     * @param shift the number of characters to shift each char
     * @return the message with each character shifted by 
     * shift amount
     */
    public static String caesarShift(String plain, int shift) {
        plain = lettersOnly(plain);
        String str = "";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char character = 0;
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++) {
                int index = letters.indexOf(plain.charAt(i));
                int number = index + shift;
                while (number >= 26) {
                    number -= 26;
                }
                character = letters.charAt(number);
                str += character;
            }
            return str;
        }
        return "";
    }

    /**
     * Returns a String with each character shifted by 13.
     * 
     * @param plain the original message
     * @return the message with each character shifted by 13
     */
    public static String rot13(String plain) {
        return caesarShift(plain, 13);
    }

    /**
     * Returns a String whose letters have been substituted using 
     * the alphabet
     * provided by the 26 letter key.
     * 
     * @param plain the original message
     * @param key   the substitution alphabet
     * @return the message with each character replaced using the substitution
     *         alphabet
     */
    public static String substitution(String plain, String key) {
        String plain1 = lettersOnly(plain);
        if (key == null) {
            key = "qwertyuiopasdfghjklzxcvbnm";
        }
        if (plain1 != null) {
            plain = lettersOnly(plain);
            String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h",
                                  "i", "j", "k", "l", "m", "n", "o", "p", 
                                  "q", "r", "s", "t", "u", "v", "w", "x", 
                                  "y", "z" };
            String str = "";
            int g = 0;
            String[] k = new String[26];
            for (int i = 0; i < key.length(); i++) {
                k[i] = "" + key.charAt(i);
            }
            for (int a = 0; a < plain1.length(); a++) {
                String n = "" + plain1.charAt(a);
                for (int z = 0; z < k.length; z++) {
                    for (int x = 0; x < alphabet.length; x++) {
                        if (n.equalsIgnoreCase(alphabet[x])) {
                            g = x;
                        }
                    }
                }
                if (plain.charAt(a) == ' ') {
                    str += ' ';
                }
                if (n == n.toLowerCase() && plain.charAt(a) != ' ') {
                    str += k[g];
                }
                if (n == n.toUpperCase() && plain.charAt(a) != ' ') {
                    str += k[g].toUpperCase();
                }
            }
            return str;
        } 
        else {
            String z = "";
            return z;
        }
    }

    /**
     * Returns a randomly generated key of length n. 
     * Each character of the * String
     * is generated by a random calculation.
     * 
     * @param n the length of the key to be created
     * @return the random key
     */
    public static String randomKey(int n) {
        String str = "";
        char charry;
        for (int i = 0; i < n; i++) {
            charry = (char) (Math.random() * 26 + 'A');
            str += charry;
        }
        return str;
    }

    /**
     * Returns a message encrypted using a one time pad.
     * Each character of the
     * message should be added to the corresponding 
     * character in the key to produce
     * the cipher. If the key length does not
     *  match the message length, the String
     * Cannot be encrypted is returned.
     * 
     * @param message the original message
     * @param key the String that will be used to encrypt this message
     * @return the encrypted message
     */
    public static String oneTimePadEncrypt(String message, String key) {
        if (message == null) {
            return "";
        }
        char c;
        String str = "";
        if (message.length() != key.length()) {
            return "String Cannot be encrypted";
        }
        for (int i = 0; i < message.length(); i++) {
            c = message.charAt(i);
            c += key.charAt(i);
            str += c;
        }
        return str;
    }

    /**
     * Returns the decrypted 
     * message given the cipher and key. 
     * Each character of the
     * key should be subtracted 
     * from the corresponding
     * character in the cipher to
     * produce the message. 
     * If the key length does not 
     * match the length of the
     * cipher, 
     * the String Cannot be 
     * decrypted is returned.
     * 
     * @param cipher the encrypted message
     * @param key    the String that will be used to decrypt this message
     * @return the decrypted message
     */
    public static String oneTimePadDecrypt(String cipher, String key) {
        if (cipher == null) {
            return "";
        }
        char c;
        String str = "";
        if (cipher.length() != key.length()) {
            return "String Cannot be decrypted";
        }
        for (int i = 0; i < cipher.length(); i++) {
            c = cipher.charAt(i);
            c -= key.charAt(i);
            str += c;
        }
        return str;
    }

    /**
     * Returns a 26 element array with a count of 
     * how many times each character in
     * the cipher occurs. The first slot of the array 
     * corresponds to A and the last
     * corresponds to Z.
     * 
     * @param cipher the original message
     * @return the array with a count of each character
     */
    public static int[] characterAnalysis(String cipher) {
        String newCipher = lettersOnly(cipher);
        int[] arr = new int[26];
        for (int i = 0; i < newCipher.length(); i++) {
            int temp = newCipher.charAt(i) - 'A';
            arr[temp] = arr[temp] + 1;
        }
        return arr;
    }
}
