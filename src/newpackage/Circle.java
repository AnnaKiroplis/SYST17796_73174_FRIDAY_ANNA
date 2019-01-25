
package newpackage;

public class Circle {

    private double radius;
    
    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        if(radius < 0){
            throw
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public String toString(){
        return String.format("Circle: \n\tradius:\t%9.2f\n\tarea:\t%9.2f", 
                radius, this.getArea());
    }
}
