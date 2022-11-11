package math;

import java.util.HashMap;
import java.util.Map;
/**
 * A solution class to the sum of two problem.
 */
public class TwoSum {
    /**
     * Return the indices of two numbers such that they add up to the given target
     * @param numbers sequence of number
     * @param target two numbers in numbers must equal the target
     * @return the indices of two numbers that equal target
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(numbers[i], i);
            }
        }
        return new int[] {};
    }
}
