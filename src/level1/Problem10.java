package level1;

import util.NumberUtils;

public class Problem10 {

    /* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

        Find the sum of all the primes below two million. */

    public static void solve() {
        boolean[] primes = NumberUtils.sieve(2000000);
        long sum = 0;

        for (int i = 0; i < primes.length; i++) {
            if (!primes[i]) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

}
