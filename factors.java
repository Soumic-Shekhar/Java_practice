import java.util.Scanner;

public class factors{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        int count = 0;


        for (int i = 1; i < Number; i++ ){

            if (Number % i == 0){

                count ++;
                System.out.print(i + ",");
            }

        }
        
        System.out.print(" Number of factors " + count + ".");
        System.out.println();
    }


}