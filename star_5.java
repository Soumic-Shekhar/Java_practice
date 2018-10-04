import java.util.Scanner;

public class star_5{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of the pyramid: ");
        int row = input.nextInt();

        for(int i = 1; i <= row; i++ ){

            for(int count = row - i; count > 0; count-- ){

                System.out.print(" ");
            }

            for(int j = 1; j <= (2 * i - 1); j++ ){
                    
                System.out.print("*");

            }

            System.out.println();
        }
        

        
    }

}