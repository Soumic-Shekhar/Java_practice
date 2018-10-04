import java.util.Scanner;

public class prime{

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);

        int Number = input.nextInt();
        int flag =0;

        for (int i = 2; i < Number/2; i++){

            if (Number % i == 0){
                flag++;
                break;

            }

        }
        if (flag == 0){
            
             System.out.println("Is a Prime Number!");
        }
            
        else{
            
            System.out.println("Is not a Prime Number");
        }

    }


}