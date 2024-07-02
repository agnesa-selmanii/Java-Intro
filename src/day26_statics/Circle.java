package day26_statics;

public class Circle {
    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter=2*radius;
    }

    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return pi*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                ", pi=" + pi +
                '}';
    }

    public static void main(String[] args) {
        Circle c=new Circle(3.2);
        System.out.println(c);
    }
}

