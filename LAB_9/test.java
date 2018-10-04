

public class test{
    public static void main(String[] args){
        PartTimeEmployee Hasib = new PartTimeEmployee("Hasib", "N/A", 15, "1712603642", "ECE", 50.0, 10.0);
        FullTimeEmployee Irfan = new FullTimeEmployee("Irfan", "Male", 80, "0112345643", "ECE", 100.0, 25.6);

        System.out.println(Hasib.toString());
        System.out.println(Irfan.toString());
    }
}