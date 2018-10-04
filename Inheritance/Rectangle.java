public class Rectangle extends Geometric_obj{
    int width;
    int height;

    public Rectangle(){

    }

    public Rectangle(int width, int height){
        super("No Color", false);
        // this(width, height, "No color");
        this.width = width;
        this.height = height;
        System.out.println("Rec_obj1");
    }

    public Rectangle(int width, int height, String color){
        super(color, true);
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width*height;
    }
}