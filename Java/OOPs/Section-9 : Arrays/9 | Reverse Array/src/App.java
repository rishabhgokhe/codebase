import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i=0; i< array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    public static void reverseArrayWithoutNewArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i=0; i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
