

public class Square extends Rectangle{
    public Square(int side, String color, Boolean filled){
        super(side, side, color);

    }

    public double diagonal(){
        return Math.sqrt(2)*width;
    }
}