public class Main {

    // 1. parenthesesCheck
public static boolean parenthesesCheck(String str){
    int numLeftParentheses = 0;
    int numRightParentheses = 0;
    int check = Math.abs(numLeftParentheses - numRightParentheses);
    for (int i = 0; i < str.length(); i++){
        if (check < 0){
            return false;
        }
        if (str.charAt(i) == '('){
            numLeftParentheses++;
        }
        if (str.charAt(i) == ')'){
            numRightParentheses++;
        }
    }
    if (check == 0){
        return true;
    }
    return false;
}

    // 2. reverseInteger
    public static String reverseInteger(int n) {
        String input = String.valueOf(n);
        String finalAns = "";
        for (int i = 0; i <input.length(); i++){

            finalAns = input.charAt(i) + finalAns;
        }
        return finalAns;
    }

    // 3. encryptThis
    //For each word: the second and the last letter is switched (e.g. Hello becomes Holle)
    // the first letter is replaced by its character code (e.g. H becomes 72) Note: there are
    // no special characters used, only letters and spaces
    //Examples: encryptThis('Hello good day'); // '72olle 103doo 100ya' encryptThis
    // ('Ready set go'); // '82yade 115te 103o'

    public static String encryptThis(String str) {
        String[] words = str.split(" ");
        String encrypted = "";

        for (String word : words) {
            if (word.length() == 0) {
                continue;
            }

            String result = Integer.toString((int) word.charAt(0));

            if (word.length() == 2) {
                result += word.charAt(1);
            } else if (word.length() > 2) {
                result += word.charAt(word.length() - 1);
                result += word.substring(2, word.length() - 1);
                result += word.charAt(1);
            }

            if (!encrypted.isEmpty()) {
                encrypted += " ";
            }
            encrypted += result;
        }
        return encrypted;
        }
    }

    // 4. decipherThis
    public static String decipherThis (String str) {
        String[] words = str.split(" ");
        String result = "";

        String deciphered = null;
        for (String word : words) {

            String firstLetterCode = String.valueOf((int) word.charAt(0));
            deciphered = "";

            if (word.length() > 2) {
                deciphered = firstLetterCode + word.charAt(word.length() - 1) + word.substring(2, word.length() - 1) + word.charAt(1);
            } else if (word.length() == 2) {
                deciphered = firstLetterCode + word.charAt(1);
            } else {
                deciphered = firstLetterCode;
            }
        }
        return deciphered;
    }