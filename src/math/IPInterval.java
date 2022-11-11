package math;

/**
 * A solution class to the IP Interval problem.
 */
public class IPInterval {
    /**
     * Return the number of IPs between a specified interval
     * @param start start interval inclusive
     * @param end end interval exclusive
     * @return number of IPs in the specified range
     */
    public static long ipsBetween(String start, String end) {
        return convertToLong(end) - convertToLong(start);
    }
    private static long convertToLong(String ip) {
        long res = 0;
        for (String s : ip.split("[.]") )
            res = res * 256 + Long.parseLong(s);
        return res;
    }
}
