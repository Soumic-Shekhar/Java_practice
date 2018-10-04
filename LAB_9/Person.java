public class Person{
    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        String toString = "Name: " + name + "\n" +
                            "Gender: " + gender + "\n" +
                            "Age: " + age + ".";
        return toString;
    }
}