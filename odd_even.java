import java.util.Scanner;

public class odd_even{

    public static void main(String[] args) {
        
        System.out.print("Input nummer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int reminder = num % 2;

        switch(reminder){

            case 0:
                 System.out.println("even");
                 break;


            case 1: 
                System.out.println("odd");
                break;
        }
    }


}