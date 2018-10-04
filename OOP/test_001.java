public class test_001{

    public static void main(String[] args){

        System.out.println(Circle.numOfCircleObj);

        Circle c1 = new Circle();

        System.out.println(c1.radius);

        static public void showCircleInfo(Circle c1){

            System.out.println(c1.getArea(20));
        }

    }
}