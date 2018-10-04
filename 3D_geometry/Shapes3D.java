abstract class Shapes3D{
    private Boolean filled;

    public Shapes3D(Boolean filled){
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    abstract double getArea(double param);
    abstract double getVolume(double param);
}