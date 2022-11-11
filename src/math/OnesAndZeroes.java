package math;

import java.util.List;

/**
 * A solution class to the ones and zeroes problem.
 */
public class OnesAndZeroes {
    /**
     * Returns an int literal of the binary representation in a list
     * @param binary array to be converted into a binary int
     * @return the int literal representation of the binary
     */
    public static int convertBinaryArrayToInt(List<Integer> binary) {
        int[] binaryEquivalent = {1, 2, 4, 8, 16, 32, 64, 128};
        int returnVal = 0;
        int binaryIndex = 0;
        // 1 2 4 8 16 32 64 128 256
        for (int i = binary.size(); i-- > 0; ) {
            if (binary.get(i) == 1) returnVal += binaryEquivalent[binaryIndex];
            binaryIndex++;
        }
        return returnVal;
    }
}