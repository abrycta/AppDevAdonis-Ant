package string;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Converts the time value to a string and outputs it into standard out
 */
public class TimetoString {

    /**
     * Converts the time value to a string and outputs it into standard out
     * @param seconds user input, to be converted into a formatted string
     * @return formatted string represenation of the time value
     */
    public static String formatDuration(int seconds) {
        return seconds == 0 ? "now" : Arrays.stream(new String[]{
                        format("year", (seconds / 31536000)),
                        format("day", (seconds / 86400) % 365),
                        format("hour", (seconds / 3600) % 24),
                        format("minute", (seconds / 60) % 60),
                        format("second", (seconds % 3600) % 60)})
                .filter(e -> e != "")
                .collect(Collectors.joining(", "))
                .replaceAll(", (?!.+,)", " and ");
    }

    /**
     * Helper method for formatDuration()
     * @param s time value string representation (e.g. year, day, hour)
     * @param time int representation of the time value
     * @return a formatted string consisting of the time string and value
     */
    public static String format(String s, int time) {
        return time == 0 ? "" : time + " " + s + (time == 1 ? "" : "s");
    }
}
