public class PartTimeEmployee extends Employee{

    private double hours;
    private double rate;

    public PartTimeEmployee(String name, String gender, int age, String id, String department, double hours, double rate){
        super(name, gender, age, id, department);
        this.hours = hours;
        this.rate = rate;
    }

    public double getHours(){
            return hours;
    }

    public double getRate(){
            return rate;
    }
    
    public void setHours(double hours){
        this.hours = hours;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public String toString(){
        
        String toString =   "Hours Worked: " + hours + "\n" +
                            "Rate per hour: " + rate + ".";
        return super.toString() + toString;
        
    }

    public double salary(){
        return hours * rate;
    }
}