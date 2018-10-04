public class Cube extends Shapes3D{
    private double side;

    public Cube(double side, Boolean filled){
        super(filled);
        this.side = side;
        
    }

    public String toString(){
        String s = "Lenght of side: " + side + "fill: " + isFilled();
        
        return s;
    }

    public double getArea(double side){
        return Math.pow(side,2);
    }

    public double getVolume(double size){
        return Math.pow(size,3);
    }



}