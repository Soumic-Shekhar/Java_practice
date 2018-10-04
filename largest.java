import java.util.Scanner;



public class largest{

    public static void main(String[] args) {

        System.out.print("Enter first number: ");
        Scanner input = new Scanner(System.in);

        int First = input.nextInt();


        System.out.print("Enter Second number: ");
        //Scanner input = new Scanner(System.in);

        int Second = input.nextInt();

        System.out.print("Enter third number: ");
        //Scanner input = new Scanner(System.in);

        int Third = input.nextInt();

        if(First >= Third && First >= Second){

            System.out.println(First);

        }
        else if(Second >= Third){

            System.out.println(Second);

        }
        else{

            System.out.println(Third);
        }
        
    }


}