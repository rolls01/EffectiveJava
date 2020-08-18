package pl.michalrola._4_ClassesAndInterfaces.Item17;

import java.util.Objects;

// Immutable complex number class
public final class Complex {

  public static final Complex ZERO = new Complex(0, 0);
  public static final Complex ONE = new Complex(1, 0);
  public static final Complex I = new Complex(0, 1);

  private final double real;
  private final double imaginary;

  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public static Complex newInstance(double re, double im) {
    return new Complex(re, im);
  }

  public double realPart() {
    return real;
  }

  public double imaginaryPart() {
    return imaginary;
  }

  public Complex plus(Complex complex) {
    return new Complex(this.real + complex.real, this.imaginary + complex.imaginary);
  }

  public Complex minus(Complex complex) {
    return new Complex(this.real - complex.real, this.imaginary - complex.imaginary);
  }

  public Complex times(Complex complex) {
    return new Complex(this.real * complex.real - this.imaginary * complex.imaginary,
        this.real * complex.imaginary + this.imaginary * complex.real);
  }

  public Complex dividedBy(Complex complex) {
    double temp = complex.real * complex.real + complex.imaginary * complex.imaginary;
    return new Complex((this.real * complex.real + this.imaginary * complex.imaginary) / temp,
        (this.imaginary * complex.real - this.real * complex.imaginary) / temp);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complex complex = (Complex) o;
    return Double.compare(complex.real, real) == 0 &&
        Double.compare(complex.imaginary, imaginary) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(real, imaginary);
  }

  @Override
  public String toString() {
    return "Complex{" +
        "real=" + real +
        ", imaginary=" + imaginary +
        '}';
  }
}
