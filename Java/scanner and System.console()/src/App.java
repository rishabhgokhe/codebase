import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // try {
        //     System.out.println(getInputFromConsole(2024));   
        // } catch (NullPointerException e) {
        //     System.out.println(getInputFromScanner(2024));
        // }
        System.out.println(getInputFromScanner(2024));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hii, What's your name? ");
        System.out.println("Hii " + name + ", Welcome to our app !!");

        String dateOfBirth = System.console().readLine("What's your birth year: ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "You are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner =  new Scanner(System.in);

        // String name = System.console().readLine("Hii, What's your name? ");
        System.out.println("Hii, What's your name ? ");
        String name = scanner.nextLine();
        System.out.println("Hii " + name + ", Welcome to our app !!");

        // String dateOfBirth = System.console().readLine("What's your birth year: ");
        System.out.println("What's your birth year: ");
        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Year must be between "+ (currentYear-125) + " and "+ currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age > 0 ? true : false;   
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input !!! Try again");
            }

        } while (!validDOB);

        scanner.close();
        return "You are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return currentYear - dob;
    }
}
