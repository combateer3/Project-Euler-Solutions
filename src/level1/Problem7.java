package level1;

import util.NumberUtils;

public class Problem7 {

    /* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

        What is the 10 001st prime number? */

    public static void solve() {
        int index = 10001;
        int count = 1; //hard coding 2 as the first prime because it's the only even prime
        //this way I can add 2 to each iteration and cut the number of loops in half
        int current = 3;

        while (count < index) {
            if (NumberUtils.isPrime(current)) {
                count += 1;
            }

            if (count == index) {
                break;
            }

            current += 2;
        }

        System.out.println(current + ": " + count);
    }

}
