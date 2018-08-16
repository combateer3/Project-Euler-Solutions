package level1;

public class Problem4 {

    /* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

        Find the largest palindrome made from the product of two 3-digit numbers. */

    public static void solve() {
        int palindrome = 0;
        int product;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                product = i * j;
                if (isPalindrome(product) && product > palindrome) {
                    palindrome = product;
                }
            }
        }

        System.out.println(palindrome);
    }

    private static boolean isPalindrome(int num) {
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

}
