import math.*;
import string.JadenCase;
import string.MexicanWave;
import string.TimetoString;
import string.YourOrder;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void invokeMathPackage() {
        int comparePowers;
        comparePowers = ComparePowers.comparePowers(new int[]{2, 10}, new int[]{2, 15});
        System.out.println("comparePowers():" + comparePowers);
        comparePowers = ComparePowers.comparePowers(new int[]{2, 10}, new int[]{2, 10});
        System.out.println("comparePowers():" + comparePowers);
        comparePowers = ComparePowers.comparePowers(new int[]{7,  7}, new int[]{5,  8});
        System.out.println("comparePowers():" + comparePowers);

        long ipDiff;
        ipDiff = IPInterval.ipsBetween("20.0.0.10", "20.0.1.0");
        System.out.println("ipsBetwwen(): " + ipDiff);

        boolean isSquare;
        isSquare = IsSquare.isSquare(5);
        System.out.println("isSquare():" + isSquare);
        isSquare = IsSquare.isSquare(4);
        System.out.println("isSquare():" + isSquare);

        int bin;
        bin = OnesAndZeroes.convertBinaryArrayToInt(
                Arrays.stream(new int[]{0,0,0,1})
                .boxed()
                .toList());
        System.out.println("convertBinaryArrayToInt(): " + bin);

        bin = OnesAndZeroes.convertBinaryArrayToInt(
                Arrays.stream(new int[]{1,1,1,1})
                        .boxed()
                        .toList());
        System.out.println("convertBinaryArrayToInt(): " + bin);

        List<String> permuted;
        permuted = Permute.singlePermutations("a");
        System.out.println("permuted(): " + permuted);
        permuted = Permute.singlePermutations("aabb");
        System.out.println("permuted(): " + permuted);

        int square;
        square = SquareAndConcatenate.squareDigits(9119);
        System.out.println("squareDigits(): " + square);
        square = SquareAndConcatenate.squareDigits(0);
        System.out.println("squareDigits(): " + square);

        int intervalSum;
        intervalSum = SumOfIntervals.sumIntervals(new int[][] {
                {1, 4},
                {7, 10},
                {3, 5}
        });

        System.out.println("sumIntervals(): "+  intervalSum);

        intervalSum = SumOfIntervals.sumIntervals(new int[][] {
                {0, 20},
                {-1000000, 10},
                {30, 40}
        });

        System.out.println("sumIntervals(): "+  intervalSum);

        int[] twoSum;
        twoSum = TwoSum.twoSum(new int[]{2, 2, 3}, 4);
        System.out.println("twoSum(): " + Arrays.toString(twoSum));
        twoSum = TwoSum.twoSum(new int[]{2, 3, 3}, 4);
        System.out.println("twoSum(): " + Arrays.toString(twoSum));
    }

    public static void invokeStringPackage() {
        String jadenCase;
        jadenCase = JadenCase.toJadenCase("How can mirrors be real if our eyes aren't real");
        System.out.println("jadenCase(): " + jadenCase);

        String[] mexicanWave;
        mexicanWave = MexicanWave.wave("Hello");
        System.out.println("mexicanWave(): " + Arrays.toString(mexicanWave));
        mexicanWave = MexicanWave.wave("The quick brown fox jumped over the lazy dog.");
        System.out.println("mexicanWave(): " + Arrays.toString(mexicanWave));

        String time;
        time = TimetoString.formatDuration(62);
        System.out.println("formatDuration(): " + time);
        time = TimetoString.formatDuration(3662);
        System.out.println("formatDuration(): " + time);

        String order;
        order = YourOrder.order("4of Fo1r pe6ople g3ood th5e the2");
        System.out.println("order(): " + order);
    }

    public static void main(String[] args) {
        invokeMathPackage();
        invokeStringPackage();
    }
}
