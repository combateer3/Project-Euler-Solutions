package util;

public class NumberUtils {

    public static boolean isPalindrome(int num) {
        String[] digits = String.valueOf(num).split("");
        String reverse = "";

        for (int i = 0; i < digits.length; i++) {
            reverse += digits[digits.length - 1 - i];
        }

        if (Integer.parseInt(reverse) == num) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        if (num % 2 == 0) {
            return false;
        }

        int factor = 3;
        while (factor < num) {
            if (num % factor == 0) {
                return false;
            } else {
                factor += 2;
            }
        }

        return true;
    }

    public static boolean[] sieve(int max) {
        boolean[] sieve = new boolean[max + 1];
        sieve[0] = true;
        sieve[1] = true;
        sieve[2] = false;

        for (int i = 4; i <= max; i += 2) {
            sieve[i] = true;
        }

        int limit = (int) (Math.sqrt(max) + 1);
        for (int i = 3; i < limit; i += 2) {
            if (!sieve[i]) {
                for (int j = i * i; j <= max; j += i) {
                    sieve[j] = true;
                }
            }
        }

        return sieve;
    }

}
