public class FullTimeEmployee extends Employee{
    private double basic;
    private double allounace;

    public FullTimeEmployee(String name, String gender, int age, String id, String department, double basic, double allounace){
        super(name, gender, age, id, department);
        this.basic = basic;
        this.allounace = allounace;
    }
    
    public double getBasic(){
        return basic;
}

    public double getAllounace(){
            return allounace;
    }

    public void setBasic(double basic){
        this.basic = basic;
    }

    public void setAllounce(double allounace){
        this.allounace = allounace;
    }

    public String toString(){
        
        String toString =   "Basic pay: " + basic + "\n" +
                            "Allounce: " + allounace + ".";
        return super.toString() + toString;
        
    }

    public double salary(){
        return basic + (allounace * basic/100);
    }
}