package string;

/**
 * Solution class to the Your Order, please problem.
 */
public class YourOrder {
    /**
     * Sort a given string, with each containing a single number
     * @param words string with integers
     * @return a sorted string
     */
    public static String order(String words) {
        if(words.length() == 0) return "";
        String[] wordArray = words.split("\\s+");
        String[] sortedArr = new String[wordArray.length];

        // iterate through every word
        for(int i = 0; i < wordArray.length; i++) {
            for(char character : wordArray[i].toCharArray()) {
                if(Character.isDigit(character))
                    sortedArr[Character.getNumericValue(character) - 1] = wordArray[i];
            }
        }
        return String.join(" ", sortedArr);
    }
}
