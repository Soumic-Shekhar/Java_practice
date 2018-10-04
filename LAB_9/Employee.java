public class Employee extends Person{
    private String id;
    private String department;
    // private double salary;

    public Employee(String name, String gender, int age, String id, String department){
        super(name, gender, age);
        this.id = id;
        this.department = department;
        // this.salary = salary;

    }

    public void setID(String id){
        this.id = id;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    // public void setSalary(double salary){
    //     // this.salary = salary;
    // }

    public String getID(){
        return id;
    }

    public String getDepartment(){
        return department;
    }

    // public double getSalary(){
    //     // return salary;
    // }

    public String toString(){
        
        String toString =   "ID: " + id + "\n" +
                            "Department: " + department + "\n" +
                            "Salary: " + ".";
        return super.toString() + toString;
        
    }

}