import java.util.Scanner;

public class list_prime{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting Number: ");
        int start = input.nextInt();

        System.out.println();

        System.out.print("Enter ending Number");
        int end = input.nextInt();

        int flag = 0;


        for (int i = start; i < end; i++ ){

            for (int j = 2; j < i / 2; i++ ){

                if( i % j == 0){

                    flag++;
                    break;
                }

            }
                

        }
        
    }


}