package shapes;
import util.Input;
public class CircleApp {
//    double radiuss;
    public static void main(String[] args) {
        Input test = new Input();
        double radius = test.getRadius();
        Circle testCircle = new Circle(radius);
        double area = testCircle.getArea();
        double circumference = testCircle.getCircumference();
        System.out.println(area);
        System.out.println(circumference);
    }
}
