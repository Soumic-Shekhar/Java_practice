public class Best_For_Customer implements Discountable{
    private double percentage;
    private double threshold;
    private double discounted;
    
    public Best_For_Customer(double percentage, double threshold, double discounted){
        
        this.percentage = percentage;
        this.discounted = discounted;
        this.threshold = threshold;
    }

    public void setPercentage(double percentage){
        this.percentage = percentage;
    }

    public void setDiscount(double discounted){
        this.discounted = discounted;
    }

    public void setThreshold(double threshold){
        this.threshold = threshold;
    }

    public double getPercentage(){
        return percentage;
    }

    public double getDiscount(){
        return discounted;
    }

    public double getThreshold(){
        return threshold;
    }



    public double discountedPrice(double price){
        double perDiscount = price - (price * getPercentage()/100);
        double thrshDiscount = price - getDiscount();
        if (price > threshold){
            if (perDiscount < thrshDiscount) return thrshDiscount;
        }
        return perDiscount;
    }
}