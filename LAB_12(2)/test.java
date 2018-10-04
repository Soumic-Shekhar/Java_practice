public class test{
    public static void main(String[] args){
        double price = 500.0;
        Best_For_Customer j = new Best_For_Customer(5.0,500.0,50.0);
        System.out.println(j.discountedPrice(price));
    }
}