public class numberToWords {
    public static void main(String[] args) {
        numberToWord(100);
        numberToWord(1);
        numberToWord(10);
        numberToWord(0);   
        numberToWord(143);   
    }

    public static void numberToWord(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            printWord(0);
            System.out.println();
            return;
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            reversedNumber /= 10;
            printWord(digit);
        }
        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            printWord(0);
        }
        
        System.out.println();  // Move to next line after printing the number words
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int rem = number % 10;
            number /= 10;
            reverse = reverse * 10 + rem;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number > 0);

        return count;
    }

    public static void printWord(int number) {
        switch (number) {
            case 0: System.out.print("Zero "); break;
            case 1: System.out.print("One "); break;
            case 2: System.out.print("Two "); break;
            case 3: System.out.print("Three "); break;
            case 4: System.out.print("Four "); break;
            case 5: System.out.print("Five "); break;
            case 6: System.out.print("Six "); break;
            case 7: System.out.print("Seven "); break;
            case 8: System.out.print("Eight "); break;
            case 9: System.out.print("Nine "); break;
            default: break;
        }
    }
}
