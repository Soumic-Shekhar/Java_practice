public class Sphere extends Shapes3D{
    private double radius;
    

    public Sphere(double radius, boolean filled){
        super(filled);
        this.radius = radius;
        
    }

    public String toString(){
        String s = "Radius: " + radius + "fill: " + isFilled();
        
        return s;
    }

    public double getArea(double radius){
        return 4 * Math.PI * Math.pow(radius,2);
    }

    public double getVolume(double radius){
        return (4/3) * Math.PI * Math.pow(radius,3);
    }
}