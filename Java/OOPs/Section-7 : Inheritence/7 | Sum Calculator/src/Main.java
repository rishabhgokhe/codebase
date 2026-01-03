public class Main {
    public static void main(String[] args) throws Exception {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(2);
        System.out.println("Addition = " + calculator.getAdditionResult());
        System.out.println("Subtraction = " + calculator.getSubtractionResult());
        System.out.println("Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Divison = " + calculator.getDivisionResult());
    }
}