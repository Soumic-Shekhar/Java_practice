public class Triangle extends Polygon{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC, int numSide){
        super(numSide);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return sideB;
    }

    public double getSideC(){
        return sideC;
    }

    public void setSideA(double sideA){
        this.sideA = sideA;
    }

    public void setSideB(double sideB){
        this.sideB = sideB;
    }

    public void setSideC(double sideC){
        this.sideC = sideC;
    }
    
    public double area(){
        return Math.sqrt(perimeter() * (perimeter() - sideA) * (perimeter() - sideB) * (perimeter() - sideC) );
    }

    public double perimeter(){
        return (sideA + sideB + sideC)/2;
    }


}
