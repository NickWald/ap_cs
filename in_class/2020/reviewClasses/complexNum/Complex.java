/*
imaginary numbers are z = a + bi
so if it was 5 + 6i
need private double real = 5
and private double imag = 6
*/

public class Complex {
  private double real;
  private double imaginary;

  public Complex(double r, double i) {
    real = r;
    imaginary = i;
  }

  public Complex(Complex c) {
    real = c.real;
    imaginary = c.imaginary;
  }

  public Complex getReal() {
    return real;
  }

  public double getImaginary() {
    return double imaginary;
  }

  public double add(Complex c) {
    /*
     * real += c.getReal(); imaginary += c.getImaginary();
     */
    return new Complex(real + c.getReal(), imaginary + c.getImaginary());
  }

  public String toString() {
    if (imaginary > 0) {
      return real + " + " + imaginary + "i";
    } else {
      return real + " - " + Math.abs(imaginary) + "i";
    }
  }

}
