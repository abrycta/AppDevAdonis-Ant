package math;

/**
 * A solution class to the square and concatenate problem
 */
public class SquareAndConcatenate {
    /**
     * Squares individual digits of a number and concatenate them.
     * @param n digit to square.
     * @return squared and concatenated digit.
     */
    public static int squareDigits(int n) {
        int BASE = 10;

        if (n < BASE) {
            return n * n;
        }
        int digit = n % BASE;
        int squaredDigit = digit * digit;
        return squaredDigit + (squaredDigit < BASE ? BASE : BASE * BASE) * squareDigits(n / BASE);
    }
}
