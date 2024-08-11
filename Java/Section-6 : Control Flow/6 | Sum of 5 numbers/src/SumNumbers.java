import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        sum5InputNumbers();
    }

    public static void sum5InputNumbers() {
        Scanner scanner = new Scanner(System.in);

        int count=0;
        double sum = 0;
        while (count != 5) {
            try {
                System.out.println("Enter number #" + (count+1) + " : ");
                double num = Double.parseDouble(scanner.nextLine());
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        }

        scanner.close();
        System.out.println("The sum of numbers is " + sum);

    }
}
