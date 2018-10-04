import java.util.Scanner;

public class Emirp{

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);

        int user_input = input.nextInt();
        boolean check = isEmirp(user_input);

        if(check == true){
            System.out.println(user_input + " is Emirp.");
        }

        else{
            System.out.println(user_input + " is not Emirp.");
        }


        

    }

    public static Boolean isPrime(int user_input) {
        
        int flag =0;

        for (int i = 2; i < user_input/2; i++){

            if (user_input % i == 0){
                flag++;
                break;

            }

        }
        if (flag == 0){
            
            return true;

        }
        return false;

    }
    
    public static boolean isEmirp(int user_input) {
        int reverse = 0;
        int mod = user_input;
        int store = 0;
        while(mod >= 0){
            store = mod % 10;
            reverse = store + reverse;
        }
        System.out.println(reverse);
        if (isPrime(user_input) == true){

            if (isPrime(reverse) == true){
                return true;
            }
        }

        else{
            System.out.println(user_input + " is not prime");
        
        }



        return false;
    }
}
