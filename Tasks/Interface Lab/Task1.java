interface Shape{
    public double getArea();
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = 3.14 * (Math.pow(radius, 2));
        return area;
    }
}

class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        double area = length * width;
        return area;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(12.0);
        shapes[1] = new Rectangle(12.0, 15.0);

        for(int i = 0; i < shapes.length; i++){
            if (shapes[i] instanceof Circle) {
                System.out.println("Area of Circle is " + shapes[i].getArea());    
            }else{
                System.out.println("Area of Rectangle is " + shapes[i].getArea());
            }
            
        }
        
    }
}
