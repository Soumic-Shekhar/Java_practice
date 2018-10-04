import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int x = num;
        long factorial = 1;

        while(x >= 1){

            factorial = factorial * x;
            x--;

        }

        for(int i = num; i > 1; i--){


            System.out.print( i + "*");

        }

    
        System.out.println("1 = " + factorial);
    }
    
}