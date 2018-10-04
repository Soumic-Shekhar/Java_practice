


public class BMI{
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(double weight, double height){
        this("n/a", weight, height);

    }

    public BMI(String name, double weight, double height){
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;

    }
    
    public double getBMI(){
        return weight/(height*height);
    }

    public String getBMIStatus(){
        double n = getBMI();
        if(n < 24) return "Under Weight";
        else if (n < 26) return "Normal";
        else return "Over Weight";
    }

    public String toString(){
        return name + " of age " + age + " is " + getBMIStatus();
    }
}