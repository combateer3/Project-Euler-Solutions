package level1;

public class Problem5 {

    /* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */

    public static void solve() {
        int current = 20;  //any numbers below 20 impossible
        boolean divisible;

        while (true) {
            divisible = true;

            for (int i = 1; i <= 20; i++) {
                if (current % i == 0) {
                    continue;
                } else {
                    divisible = false;
                    break;
                }
            }

            if (divisible) {
                System.out.println(current);
                break;
            } else {
                current++;
                //System.out.println(current);
            }
        }
    }

}
