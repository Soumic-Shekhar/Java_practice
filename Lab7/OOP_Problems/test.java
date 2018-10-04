public class test{
    public static void main(String []args){
        // BMI i = new BMI(55,1.5);
        // i.setAge(23);
        // i.setName("x");
        // System.out.println(i.toString());

        Course c = new Course("CSE 215");
        c.addStudents("x");
        c.addStudents("y");
        System.out.println(c.getnumberOfStudents());
        // String []s = c.getStudents();

        for(String name:c.getStudents()){
            System.out.print(name + " ");
        }
    }
}