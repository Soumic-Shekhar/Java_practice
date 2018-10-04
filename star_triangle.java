import java.util.Scanner;

public class star_triangle{

    public static void main(String[] arg) {
        System.out.print("Enter a number");
        Scanner input = new Scanner(System.in);

        int num_row = input.nextInt();

        for(int i = 0; i < num_row; i++ ){
        
            for (int j = num_row; i > 0; i--){

                System.out.print(" ");
            }   

            for (int k = 0; i < num_row; i++){

                System.out.print("*");
            }

            System.out.println('\n');

        }
    }
}