package string;

/**
 * A solution class to the Mexican Wave string problem.
 */
public class MexicanWave {

    /**
     * Expects a string and turns the passed string into a mexican wave
     * @param mString string to be converted into a mexican wave
     * @return an array of strings from which mString is converted into a sequence of mexican wave interpolations
     */
     public static String[] wave(String mString) {
         mString = mString.toLowerCase();
         int seatCount = countSeat(mString);
         String[] wave = new String[seatCount];
         for (int waveIndex = 0, seatIndex = 0; waveIndex < wave.length; waveIndex++, seatIndex++) {
             char seat = mString.charAt(seatIndex);
             while (Character.isWhitespace(seat)) {
                 seat = mString.charAt(++seatIndex);
             }
             StringBuilder mWaveStringBuilder = new StringBuilder(mString);
             mWaveStringBuilder.setCharAt(seatIndex, Character.toUpperCase(seat));
             wave[waveIndex] = mWaveStringBuilder.toString();
         }
         return wave;
     }

    /**
     * Helper subroutine of wave()
     * @param seatString expects the string representation of the seat
     * @return the number of seats
     */
     private static int countSeat(String seatString) {
         int mSpaceCount = (int) seatString.codePoints().filter(Character::isWhitespace).count();
         return seatString.length() - mSpaceCount;
     }


}
