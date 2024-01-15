/*Create a class called Complex for performing arithmetic on complex numbers. Complex numbers have the form a+bi where a is real part and b is imag part and i=√-1.

Write a program to test your class. Use floating point variables to represent the private data of the class. Provide constructor that enable an object to be initialized when it is declared. Provide no argument constructor with default values in case no initializers are provided. Provide public methods for addition, subtraction, multiplication and division of complex numbers. Pass objects of Complex as parameters of the method.

Input and Output Requirements:
Program reads real and imag parts of two complex numbers through keyboard and displays their sum, difference, product and quotient as result. */

import java.util.Scanner;

class Complex {
    private double real;
    private double imag;

    public Complex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex sub(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    public Complex multiply(Complex other) {
        double Real = this.real * other.real - this.imag * other.imag;
        double Imag = this.real * other.imag + this.imag * other.real;
        return new Complex(Real, Imag);
    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imag * other.imag;
        double Real = (this.real * other.real + this.imag * other.imag) / denominator;
        double Imag = (this.imag * other.real - this.real * other.imag) / denominator;
        return new Complex(Real, Imag);
    }

    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imag parts of the first complex number:");
        System.out.print("Real: ");
        double real1 = sc.nextDouble();
        System.out.print("Imaginary: ");
        double imaginary1 = sc.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        System.out.println("Enter the real and imag parts of the second complex number:");
        System.out.print("Real: ");
        double real2 = sc.nextDouble();
        System.out.print("Imaginary: ");
        double imaginary2 = sc.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        System.out.println("\nResults:");
        System.out.print("Sum: ");
        complex1.add(complex2).display();

        System.out.print("Difference: ");
        complex1.sub(complex2).display();

        System.out.print("Product: ");
        complex1.multiply(complex2).display();

        System.out.print("Quotient: ");
        complex1.divide(complex2).display();

        sc.close();
    }
}
