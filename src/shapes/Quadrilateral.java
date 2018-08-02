package shapes;

public abstract class Quadrilateral extends shape implements Measurable {
    protected double length;
    protected double width;

    public void Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    abstract void setLength(double length);
//    {
//        this.length = length;
//    }
    abstract void setWidth(double width);
//    {
//        this.width = width;
//    }
    @Override
    public double getPerimeter(){
        return 0;
    }
    @Override
    public double getArea() {
        return 0;

    }


}
