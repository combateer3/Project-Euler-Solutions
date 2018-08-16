package level1;

public class Problem3 {

    /* The prime factors of 13195 are 5, 7, 13 and 29.

            What is the largest prime factor of the number 600851475143 ? */

    public static void solve() {
        long num = 600851475143L;
        int factor = 3;
        int lastFactor = 1;

        if (num % 2 == 0) {
            num /= 2;
            lastFactor = 2;

            while (num % 2 == 0) {
                num /= 2;
            }
        }

        while (num > 1) {
            if (num % factor == 0) {
                num /= factor;
                lastFactor = factor;

                while (num % factor == 0) {
                    num /= factor;
                }
            }

            factor += 2;
        }

        System.out.println(lastFactor);
    }

}
