public class Faculty extends Employee{
    private String initial;
    private String rank;

    public Faculty(String name, String gender, int age, String id, String department, double salary, String initial, String rank){
        super(name, gender, age, id, department);
        this.initial = initial;
        this.rank = rank;
    }

    public void setInitial(String initial){
        this.initial = initial;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public String getInitial(){
        return initial;
    }

    public String getRank(){
        return rank;
    }

    public String toString(){
        
        String toString =   "Initial: " + initial + "\n" +
                            "Rank: " + rank + "\n" + ".";
        
        return super.toString() + toString;
    }
}