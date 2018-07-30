package shapes;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area = 3.14 * (radius * radius);
//        System.out.println(area);
        return area;
    }
    public double getCircumference(){
        double Circumference = 2 * 3.14 * radius;
        return Circumference;
//        System.out.println(Circumference);
    }

}
