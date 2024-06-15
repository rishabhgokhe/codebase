public class PerfectNumber {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        if (isPerfectNumber(6)) {
            System.out.println("Number is a Perfect Number");
        } else {
            System.out.println("Number is not a Perfect Number");
        }
    }

    public static boolean isPerfectNumber(int number) {

        int sum=0;
        if (number < 1) return false;

        for (int i=1; i<number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return (sum == number);
    }
}
