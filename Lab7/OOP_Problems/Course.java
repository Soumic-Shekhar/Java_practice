public class Course{
    private String name;
    private int numberOfStudents;
    private String[] student;
    
    public Course(String name){
        this.name = name;
        numberOfStudents = 0;
        student = new String[45];
    }

    public String getName(){
        return name;
    }

    public void addStudents(String student){
        this.student[numberOfStudents] = student;
        numberOfStudents++;        

    } 

    public String[] getStudents(){
        String []studentsList = new String[numberOfStudents];
        for(int i = 0; i < numberOfStudents; i++){
            studentsList[i] = student[i];
        }
        return studentsList;
    }

    public int getnumberOfStudents(){
        return numberOfStudents;
    }

}