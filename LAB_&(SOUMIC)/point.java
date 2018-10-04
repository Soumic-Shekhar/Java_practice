public class point{
    private int x;
    private int y;

    public point(){

    }

    public point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y= y;
    }

    public int[] getXY(){
        int[] Point = {x,y};
        return Point;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        String s = "(" + x + "," + y + ")";
        return s;
    }

    public double distance(point Point){
        int abcisa = this.x - Point.getX();
        int ordinate = this.y - Point.getY();
        return Math.sqrt(Math.pow(abcisa, 2) + Math.pow(ordinate, 2));
    }

    public double distance(int x, int y){
        int abcisa = this.x - x;
        int ordinate = this.y -y;
        return Math.sqrt(Math.pow(abcisa, 2) + Math.pow(ordinate, 2));
    }
}