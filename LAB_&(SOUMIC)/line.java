

public class line{
    private point Start;
    private point End;

    public line(point Start, point End){
        this.Start = Start;
        this.End = End;
    }

    public line (int x1, int y1, int x2, int y2){
        this.Start = new point(x1, y1);
        this.End = new point(x2, y2);
    }

    public point getStart(){
        return Start;
    }

    public point getEnd(){
        return End;
    }

    public void setStart(point Start){
        this.Start = Start;
    }

    public void setEnd(point End){
        this.End = End;
    }

    public double length(){
        return Start.distance(End);
    }
}