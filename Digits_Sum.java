import java.util.Scanner;

public class Digits_Sum{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int flag = 0;
        int number = num;

        while (num > 0){

            num = num/10;
            flag++;

        }

        System.out.println("Number of digits of " + number +" is: " + flag);
        
    }

}