import java.util.Scanner;

public class QUIZ_1_01{

    public static void main(String[] args) {

        int min = 50;
        int max = 150;

        int n_1 = (int) (min + Math.random() * (max - min + 1)); 
        int n_2 = (int) (min + Math.random() * (max - min + 1));

        System.out.println("The two randomly generated numbers are: " + n_1 + " and " + n_2);
        int sum = 0;
        System.out.print("Their common divisor are: ");
    for (int i = 1; i < n_1; i++){

        if ((n_1 % i == 0) && (n_2 % i == 0) ){

            System.out.print( i + " " );
            sum += i;
            

        }


    }
    System.out.println();
    System.out.println("Sum of the common divisor is: " + sum);



    }


    
}