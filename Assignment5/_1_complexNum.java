class _1_complexNum {
    double real;
    double img;

    _1_complexNum(double real, double img) {
        this.real = real;
        this.img = img;
    }

    void displayCompNumber() {
        System.out.println(real + (img < 0 ? "-" : "+") + Math.abs(img) + "i");
    }

    _1_complexNum addCompNumber(_1_complexNum other) {
        double sumReal = this.real + other.real;
        double sumImg = this.img + other.img;
        return new _1_complexNum(sumReal, sumImg);
    }

    _1_complexNum subCompNumber(_1_complexNum other) {
        double sumReal = this.real - other.real;
        double sumImg = this.img - other.img;
        return new _1_complexNum(sumReal, sumImg);
    }

    _1_complexNum mulCompNumber(_1_complexNum other) {
        double sumReal = ((this.real * other.real) - (this.img * other.img));
        double sumImg = ((this.real * other.img) + (this.img * other.real));
        return new _1_complexNum(sumReal, sumImg);
    }

    public static void main(String[] args) {

        _1_complexNum num1 = new _1_complexNum(5, 3);
        _1_complexNum num2 = new _1_complexNum(-2, -4);

        System.out.print("Complex Number 1: ");
        num1.displayCompNumber();

        System.out.print("Complex Number 2: ");
        num2.displayCompNumber();

        _1_complexNum sum = num1.addCompNumber(num2);
        System.out.print("Sum of Complex Numbers: ");
        sum.displayCompNumber();

        _1_complexNum sub = num1.subCompNumber(num2);
        System.out.print("Sub of Complex Numbers: ");
        sub.displayCompNumber();

        _1_complexNum mul = num1.mulCompNumber(num2);
        System.out.print("Multiplication of Complex Numbers: ");
        mul.displayCompNumber();
    }
}
