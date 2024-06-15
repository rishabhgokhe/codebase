public class GreatestCommonDivisor {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Greatest Common divisor = " + getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisorOptimised(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int smallest, greatest, gcd=1;
        if (first < 10 || second < 10) return (-1);

        if (first > second) {
            greatest =first;
            smallest =second;
        } else {
            greatest = second;
            smallest = first;
        }

        for (int i = 1; i <= smallest; i++) {
            if (greatest % i == 0 && smallest % i ==0) {
                if (gcd < i) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    public static int getGreatestCommonDivisorOptimised(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int smallest = Math.min(first, second);
        int gcd = 1;

        for (int i = 1; i <= smallest; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
