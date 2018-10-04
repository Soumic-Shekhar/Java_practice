import java.util.Scanner;

public class check_array{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] arr = {93, 73, 45, 53, 0};

        int flag = 0;

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 0; i < 5; i++){

            if(arr[i] == num){

                flag = 1;
                break;
            }

        }

        if( flag == 1) {

            System.out.println("number present.");
        }

        else{

            System.out.println("number not present.");
        }
        
    }

}