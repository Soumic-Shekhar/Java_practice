import java.util.Arrays;
import java.util.Collections;



public class circle{
    private double radius;
    private point center;

    public circle(int x,int y, double radius){
        center.setX(x);
        center.setY(y);
        this.radius = radius;
    }

    public circle(point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public point getCenter(){
        return center;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setCenter(point center){
        this.center = center;
    }

    public String toString(){
        String s = "[Radius = " + radius + "," + "Center = " + center + "]";

        return s;
    }

    public double getArea(){
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
    
    public double getCircumferance(){
        return 2*Math.PI*radius;
    }

    public double distanceToCenter(circle Circle){
        return center.distance(Circle.center);
    }

    public double distanceToPoint(int x, int y){
        return center.distance(x,y);
    }
    
    public double minDistanceToCircle(circle Circle){
        return distanceToCenter(Circle) - (this.radius + Circle.radius);
    }

    public void printByArea(circle[] Circle){
        double[] area = new double[Circle.length];
        for (int i = 0; i < Circle.length; i++){
            area[i] = Circle[i].getArea();
        }

        Arrays.sort(area);

        for(int i = Circle.length-1; i >= 0; i--){
            System.out.print("Area of the circle is: " + area[i] + " with radius: " + Circle[i].radius);
        }
    }
}