public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Please enter a valid input");

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
          int num1_lastDigit = num1 % 10;
        int num2_lastDigit = num2 % 10;
        int num3_lastDigit = num3 % 10;

        return (num1_lastDigit == num2_lastDigit) || (num2_lastDigit == num3_lastDigit) || (num3_lastDigit == num1_lastDigit);  
        }
        return false;
        
    }

    public static boolean isValid(int num) {
        return num >= 10 && num < 1000;
    }
}
