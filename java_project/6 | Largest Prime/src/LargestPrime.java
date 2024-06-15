public class LargestPrime {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(getLargestPrime(12));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(217));
    }
 
    public static int getLargestPrime(int number) {
        
        if (number < 2) {
            return -1;
        }
 
        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }
}
