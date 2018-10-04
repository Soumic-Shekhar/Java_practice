

abstract public class Polygon{
    private int numSide;

    public Polygon(int numSide){
        this.numSide = numSide;
    }

    public int getNumSide(){
        return numSide;
    }

    public void setNumSide(int numSide){
        this.numSide = numSide;
    }

    abstract double area();
    abstract double perimeter();

}