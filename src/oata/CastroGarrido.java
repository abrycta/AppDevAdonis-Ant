package oata;
public class CastroGarrido {
    }
}

// Enrico / Lupin Start
// public class MexicanWave {

//     public static String[] wave(String mString) {
//         mString = mString.toLowerCase();
//         int seatCount = countSeat(mString);
//         String[] wave = new String[seatCount];
//         for (int waveIndex = 0, seatIndex = 0; waveIndex < wave.length; waveIndex++, seatIndex++) {
//             char seat = mString.charAt(seatIndex);
//             while (Character.isWhitespace(seat)) {
//                 seat = mString.charAt(++seatIndex);
//             }
//             StringBuilder mWaveStringBuilder = new StringBuilder(mString);
//             mWaveStringBuilder.setCharAt(seatIndex, Character.toUpperCase(seat));
//             wave[waveIndex] = mWaveStringBuilder.toString();
//         }
//         return wave;
//     }

//     private static int countSeat(String seatString) {
//         int mSpaceCount = (int) seatString.codePoints().filter(Character::isWhitespace).count();
//         return seatString.length() - mSpaceCount;
//     }

// }

// import utils.MorseCode;

// public class MorseCodeDecoder {
//     public static String decode(String morseCode) {
//         StringBuilder sb = new StringBuilder();
//         for (String code : morseCode.trim().replace("   ", " / ").split(" "))
//             sb.append(code.equals("/") ? " " : MorseCode.get(code));
//         return sb.toString();
//     }
// }

// public class RowSumOddNumbers {
//     static int rowSumOddNumbers(int n) {
//         int firstInNthRow = n * n - (n - 1);
//         int lastInNthRow = firstInNthRow + (n - 1) * 2;
//         return (firstInNthRow + lastInNthRow) * n / 2;
//     }

//     static int rowSumOddNumbers2(int n) {
//         return n * n * n;
//     }
// }

// Row of the Odd Triangle
// public class UserSolution {
//     public static long[] oddRow(int n) {
//         long[] result = new long[n];
//         for (int i=0;i<n;i++) {
//             result[i] = (long) n*n-n+1 + 2*i;
//         }
//         return result;
//     }
// }

// public class WelcomeToTheCity {
//     public String sayHello(String [] name, String city, String state){
//         return "Hello, "+String.join(" ", name)+"! Welcome to "+city+", "+state+"!";
//     }
// }
// Enrico / Lupin End
