import java.util.Scanner;

public class range_prime{

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter min: ");
        int min = input.nextInt();

        if (min <= 1){

            min = 2;

        }

        System.out.print("Enter max: ");
        int max = input.nextInt();

        int flag = 0;


        for (int j = min ; j <= max; j++){

            for (int i = 2; i < j ; i++){

                if (j % i == 0){
                    flag++;
                    break;

                }



            }

            if (flag == 0){
                
                 System.out.print( j + ";");
            }
                
            else{
                
                flag = 0;
            }


        }

        System.out.println("Finished!!!");

    }

  
}