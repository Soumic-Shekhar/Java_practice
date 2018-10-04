

public class Geometric_obj{
    String color;
    Boolean filled;

    public Geometric_obj(){
        this("No Color", false);
    }

    public Geometric_obj(String color, boolean filled){
        System.out.println("Geo_obj");
        this.color = color;
        this.filled = filled;
    
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        if(filled) return "Color is " + color + " and filled";
        else return "Color is " + color + " and not filled";
    }
}