// Abstract class GeometricFigure
abstract class GeometricFigure {
    double dim1;
    double dim2;

    GeometricFigure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double getArea();
}

class Rectangle extends GeometricFigure {
    Rectangle(double length, double width) {
        super(length, width);
    }

    double getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends GeometricFigure {
    Triangle(double base, double height) {
        super(base, height);
    }

    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}

class figure {
    public static void main(String[] args) {
        GeometricFigure figure1 = new Rectangle(5, 10);
        Triangle figure2 = new Triangle(8, 6);

        System.out.println("Area of Rectangle: " + figure1.getArea());
        System.out.println("Area of Triangle: " + figure2.getArea());
    }
}
