public class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary) {
        this.real +=  real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber other) {
        this.real += other.getReal();
        this.imaginary += other.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber other) {
        this.real -= other.getReal();
        this.imaginary -= other.getImaginary();
    }

}
