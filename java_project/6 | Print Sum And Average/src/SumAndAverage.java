import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) throws Exception {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum=0, count=0;
        double  avg=0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (count > 0) {
            avg = (double) sum / count;
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = "+ avg);
    }
}
