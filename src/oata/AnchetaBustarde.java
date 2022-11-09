import java.math.BigInteger;

public class AnchetaBustarde {
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        String n1S = n1.toString();
        String n2S = n2.toString();

        char[] n1C = n1S.toCharArray();
        char[] n2C = n2S.toCharArray();


        int len_a = n1C.length, len_b = n2C.length;
        if (len_a == 1 && len_b == 1 && n2C[0] == '0' && n1C[0] == '0')
            return 1;
        if (len_b == 1 && n2C[0] == '0')
            return 1;
        if (len_a == 1 && n1C[0] == '0')
            return 0;
        int exp = (Modulo(4, n2C) == 0) ? 4 : Modulo(4, n2C);
        int res = (int)(Math.pow(n1C[len_a - 1] - '0', exp));
        return res % 10;
    }
    static int Modulo(int a, char b[])
    {
        int mod = 0;
        for (int i = 0; i < b.length; i++)
            mod = (mod * 10 + b[i] - '0') % a;

        return mod;
    }
  

    public static double findUniq(double arr[]) {
        double UN = arr[0];
        double tempUN = 0;
        int c = 3;
        if(UN != arr[1]){
            tempUN = arr[1];
            if(arr[1] == arr[2]){
                tempUN = arr[0];
            }
        }else if(UN != arr[2]){
            tempUN = arr[2];
        }else {
            tempUN = arr[0];
            while(c < arr.length){
                if(tempUN != arr[c]){
                    tempUN = arr[c];
                    break;
                }
                c++;
            }
        }
        return tempUN;
    }
    
  
    public static long[] findEmirp(long n){
        int counter = 0, reverse, primeTotal = 0, bigBoy = 0, total = 0;
        while (counter <= n) {
            if (isPrime(counter)){
                reverse = reverse(counter);
                if (isPrime(reverse) && counter != reverse){
                    total = total + counter;
                    primeTotal += 1;
                    bigBoy = counter;
                }
            }
            counter++;
        }
        System.out.println(primeTotal);
        System.out.println(bigBoy);
        System.out.println(total);
        return new long[]{primeTotal, bigBoy, total};
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int num) {
        String reversableString = String.valueOf(num);
        return Integer.parseInt(new StringBuilder(reversableString).reverse().toString());
    }

  
    public static String high(String s) {
        return Arrays.stream(s.split(" ")).max(Comparator.comparingInt(a -> a.chars().map(i -> i - 96).sum())).get(); 
    }
}
  
  
