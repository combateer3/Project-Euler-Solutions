package level1;

public class Problem9 {

    public static void solve() {
        double c, sum;

        for (int i = 1; i < 500; i++) {
            for (int j = 1; j < 500; j++) {
                c = Math.sqrt(i * i +  j * j);
                sum = i + j + c;

                if (sum == 1000 && i < j && j < c) {
                    System.out.println(i + "+" + j + "+" + c + "=" + sum);
                    System.out.println(i * j * c);
                }
            }
        }
    }

}
