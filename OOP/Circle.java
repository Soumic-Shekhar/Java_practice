public class Circle{

    double radius;
    boolean filled;

    static int numOfCircleObj;
    final static double PI = 3.14159;

    Circle(){

        radius = 0.0;
        filled = true;
        numOfCircleObj++;
    }

    Circle(double r){

        radius = r;
        filled = true;
        numOfCircleObj++;

    }

    Circle(double r, boolean f){
        radius = r;
        filled = f;
        numOfCircleObj++;
    }

    public double getArea(double radius){
        double area = PI * radius * radius;
        return area;
    }

}