import java.util.Scanner;

public class students{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total marks obtained by the student: ");
        int studentsTotalMarks = input.nextInt();

        int n = (10 - (studentsTotalMarks / 10)) ;



        switch (n){

                case 1: 
                System.out.println("The grade obtained by the student is A");
                break;

                case 2: 
                System.out.println("The grade obtained by the student is B");
                break;

                case 3: 
                System.out.println("The grade obtained by the student is C");
                break;
            
                case 4: 
                System.out.println("The grade obtained by the student is D");
                break;

                case 5: 
                System.out.println("The grade obtained by the student is F");
                break;


        }

        
    }

}