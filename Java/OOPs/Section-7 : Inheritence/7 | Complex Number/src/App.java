public class App {
    public static void main(String[] args) throws Exception {
        ComplexNumber number1 = new ComplexNumber(2, 6);
        ComplexNumber number2 = new ComplexNumber(1, 4);
        number1.add(number2);
        System.out.println("Complex number1 after addition = " + number1.getReal() + " + " + number1.getImaginary() + "i");
    }
}
