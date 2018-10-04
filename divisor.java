import java.util.Scanner;



public class divisor{
    public static void main(String[] args) {

        System.out.print("Enter Number: ");
        Scanner input = new Scanner(System.in);

        int Number = input.nextInt();

        for (int i = 1; i < Number; i++){
            if (Number % i == 0){
                System.out.print(i + ",");
            }
            
        }

        System.out.print("\n");


        
    }


}