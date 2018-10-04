import java.util.Scanner;
import java.lang.Math;

public class Fibonacci{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = input.nextInt();
        
        double arr [] = new double [num];

        for (int i = 0; i < num ; i++){

            arr[i] = ((Math.pow((1 + Math.sqrt(5)),i) - Math.pow((1 - Math.sqrt(5)),i)) / (Math.pow(2,i) * Math.sqrt(5)));

        }

        for (int i = 0; i < num; i++){

            System.out.printf("%.1f", arr[i]);
            System.out.print(" ");
        }
    }
}