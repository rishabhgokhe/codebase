import java.util.Scanner;

public class MinAndMaxNumber {
    public static void main(String[] args) throws Exception {
        printMinAndMax(args);
    }

    public static void printMinAndMax(String[] args) {
        double min=0, max=0;
        int loopCount = 0;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to find the minimum and maximum. Enter a non-numeric value to exit.");

        while (!exit) {
            System.out.println("Enter a number : ");
            try {
                double num = Double.parseDouble(scanner.nextLine());
                if (loopCount == 0 || num < min) {
                    min = num;
                }
                if ( loopCount == 0 || num > max) {
                    max = num;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                exit = true;
            }
        }
        scanner.close();
        if (loopCount > 0) {
            System.out.println("Entered maximum number = " + max + " minumum number = " + min);
        } else {
            System.out.println("No data is entered");
        }
    }
}
