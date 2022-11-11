package math;

/**
 * A solution class to the compare powers problem.
 */
public class ComparePowers {
    /**
     * Compares the powers of 2 numbers, returning -1 if the first member is larger,
     * 0 if they are equal, otherwise will return 1. [6 Kyu]
     * @param number1 first number.
     * @param number2 second number.
     * @return Return -1 if the first member is larger,
     *  0 if they are equal, otherwise return 1.
     */
    public static int comparePowers(int[] number1, int[] number2) {
        return (Double.compare(Math.log(number2[0]) * number2[1], Math.log(number1[0]) * number1[1]));
    }
}
