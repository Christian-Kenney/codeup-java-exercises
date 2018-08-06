package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double l, double w){
//        super(l, w);
    }

    @Override
    void setLength(double length){
        this.length = length;
    }

    @Override
    void setWidth(double width){
        this.width = width;
    }

    @Override
    public double getPerimeter(){
        return (this.length * 2) + (this.length * 2);
    }
    public double getArea(){
        return length * width;
    }

}
