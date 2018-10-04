import java.util.*;
import java.io.*;

public class Circle extends Shape implements IComparable{
    private double radius;

    public Circle(double radius, String color){
        super(color);
        IllegalShapeException error = new IllegalShapeException("Radius Cannot be 0 or negative!");
        try{
            if(radius <= 0){
                throw error;
            }
            else{
                this.radius = radius;
            }
        }catch(Exception e){
            error.displayErrorMessage();
        }
    }

    public void setRadius(double radius){
        IllegalShapeException error = new IllegalShapeException("Radius Cannot be 0 or negative!");
        try{
            if(radius <= 0){
                throw error;
            }
            else{
                this.radius = radius;
            }
        }catch(Exception e){
            error.displayErrorMessage();
        }
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void writeToFile(){
        File fp = new File("/home/soumic/Desktop/LAB_Final/Shape.txt");

        if(fp.exists){
            fp.println("Color = " + super.getColor() + "radius= "+ getRadius() + "area = " + this.getArea() + "perimeter= " + getPerimeter());
        }
    }

    public void readFromFile(){

    }

    public int compareShape(Object object){
        
       if(object instanceof Circle){
            if(this.getArea() > ((Circle)object).getArea()){
                return 1;
            }
            else if(this.getArea() == ((Circle)object).getArea()){
                return 0;
            }
            return -1;
       }

       else{
           return 911;
       }


       
    }
}