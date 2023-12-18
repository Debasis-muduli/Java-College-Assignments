/*Design a class ComplexNum having data members real and img. The class should have a
parameterized constructor to initialize its data members. It should also have methods
displayCompNumber() to display the complex number (in the format 5+3i for example),
addCompNumber() to add two Complex numbers. Test these methods by creating main
method in another class.*/

class Complexnum {
    double real;
    double img;

    Complexnum(double real, double img) {
        this.real = real;
        this.img = img;
    }

    void displayCompNumber() {
        System.out.println(real + (img < 0 ? "-" : "+") + Math.abs(img) + "i");
    }

    Complexnum addCompNumber(Complexnum other) {
        double sumReal = this.real + other.real;
        double sumImg = this.img + other.img;
        return new Complexnum(sumReal, sumImg);
    }

    public static void main(String[] args) {

        Complexnum num1 = new Complexnum(5, 3);
        Complexnum num2 = new Complexnum(-2,-4);

        System.out.print("Complex Number 1: ");
        num1.displayCompNumber();

        System.out.print("Complex Number 2: ");
        num2.displayCompNumber();

        Complexnum sum = num1.addCompNumber(num2);
        System.out.print("Sum of Complex Numbers: ");
        sum.displayCompNumber();
    }
}
