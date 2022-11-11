package string;
/**
 * A solution class to the Jaden Case problem.
 */
public class JadenCase {

    /**
     * Function representation of Jaden Smith's tweets
     * @param phrase to be converted into Jaden Case
     * @return Jaden Case version of the string, where the first letter of every word is capitalized
     */
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase == "") return null;
        StringBuilder result = new StringBuilder();
        Character[] chars =
                phrase.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        for (int i = 0; i < chars.length; i++) {
            // test for beginning char
            if (i == 0) chars[i] = Character.toUpperCase(chars[i]);
            else if (chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            result.append(chars[i]);
        }
        return result.toString();
    }
}
