public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length+this.width)*2;
    }

    @Override
    public String toString() {
        return "area of the rectangle "+getArea()+"\nthe perimeter of the rectangle "+getPerimeter();
    }
}
