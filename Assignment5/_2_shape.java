class point {
    int xCo;
    int yCo;

    point(int x, int y) {
        xCo = x;
        yCo = y;
    }

    void printPoint() {
        System.out.println("The point is (" + xCo + "," + yCo + ")");
    }
}

class circle extends point{
    double radius;
    circle(int x,int y,double radius){
        super(x, y);
        this.radius=radius;
    }
    void printCircle(){
        System.out.println("Area of circle is:"+(3.14*radius*radius));
    }
}
class cylinder extends circle{
    int height;
    cylinder(int x,int y,double radius,int height){
        super(x, y,radius);
        this.height=height;
    }
    void printCylinder(){
        System.out.println("volume of cylinder is:"+(3.14*radius*radius*height));
    }
}

public class _2_shape {
    public static void main(String[] args) {
        cylinder obj= new cylinder(4,5,5,5);
        obj.printPoint();
        obj.printCircle();
        obj.printCylinder();
    }
}
