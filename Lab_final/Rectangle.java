import java.util.*;
import java.io.*;

public class Rectangle extends Shape implements IComparable{
    private double length;
    private double width;

    public Rectangle(double length, double width, String color){
        super(color);
        IllegalShapeException error = new IllegalShapeException("length Cannot be 0 or negative!");
        try{
            if(length <= 0){
                throw error;
            }
            else{
                this.length = length;
            }
        }catch(Exception e){
            error.displayErrorMessage();
        }
        try{
            if(width <= 0){
                throw error;
            }
            else{
                this.width = width;
            }
        }catch(Exception e){
            error.displayErrorMessage();
        }
    }

    public void setLength(double length){
        IllegalShapeException error = new IllegalShapeException("Radius Cannot be 0 or negative!");
        try{
            if(length <= 0){
                throw error;
            }
            else{
                this.length = length;
            }
        }catch(Exception e){
            error.displayErrorMessage();
        }
    }

    public void setWidth(double width){
        IllegalShapeException error = new IllegalShapeException("Radius Cannot be 0 or negative!");
        try{
            if(width <= 0){
                throw error;
            }
            else{
                this.width = width;
            }
        }catch(Exception e){
            error.displayErrorMessage();
        }
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    public void writeToFile(){
        File fp = new File("/home/soumic/Desktop/LAB_Final/Shape.txt");

        if(fp.exists){
            fp.println("Color = " + super.getColor() + "length= "+ getLength()+ "width "+ getWidth() + "area = " + this.getArea() + "perimeter= " + getPerimeter());
        }
    }

    public void readFromFile(){

    }

    public int compareShape(Object object){
       if(object instanceof Rectangle){
            if(this.getArea() > ((Rectangle)object).getArea()){
                return 1;
            }
            else if(this.getArea() == ((Rectangle)object).getArea()){
                return 0;
            }
            return -1;
       }

       else{
           return 911;
       }


       
    }
}