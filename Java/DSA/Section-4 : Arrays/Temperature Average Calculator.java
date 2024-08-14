import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int average = 0, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many day's temperature ? ");
        int days = scanner.nextInt();
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = 0 ; i < days ; i++) {
            System.out.println("Day " + i + "'s high temp : ");
            int temp = scanner.nextInt();
            tempList.add(i);
            average += temp/days;
        }
        for (int temperature : tempList) {
            if (temperature > average) {
                count++;
            }
        }
        System.out.println("Average = "+average);
        System.out.println(count+" day(s) above average");
    }
}