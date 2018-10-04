import java.util.Scanner;

public class proper_factors{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        int sum = 0;


        for (int i = 1; i <= Number/2 ; i++ ){

            if (Number % i == 0){

                sum += i;
               
            }

        }

        if (sum == Number){

            System.out.println("Its a perfect factor.");

        }

        else{

            System.out.println(Number + " not a perfect number.");
        }
        

    }


}