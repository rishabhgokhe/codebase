import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        int returnedMin = findMin1(returnedArray);
        System.out.println("Minimum value: " + returnedMin);
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list of integers seperated by commas : ");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        int[] value = new int[numbers.length];
        for (int i=0; i<numbers.length;i++) {
            value[i] = Integer.parseInt(numbers[i].trim());
        }
        scanner.close();
        return value;
    }

    public static int findMin1(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int readInteger() {
        Scanner scanner =  new Scanner(System.in);
        int number =  Integer.parseInt(scanner.nextLine());
        scanner.close();
        return number;
    }

    public static int[] readElements(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[numberOfElements];
        for (int i=0; i<numberOfElements; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
        return array;
    }

    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
