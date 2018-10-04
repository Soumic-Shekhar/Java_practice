public class test{
    public static void main(String[] args){
        Rectangle r = new Rectangle(10,15);

        System.out.println(r.getArea());

        r.setColor("Red");
        System.out.println(r.getColor());
        System.out.println(r.toString());

        Rectangle r2 = new Rectangle(20, 30, "Green");
        System.out.println(r2.toString());

    }
}