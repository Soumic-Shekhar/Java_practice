import java.util.Scanner;



public class BANK{

    static int balance = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("Enter a Choice: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");

            int user_input = input.nextInt();

            if(user_input == 1){
                System.out.print("Enter the amount to Deposite: ");
                int deposite = input.nextInt();
                Deposit(deposite);

            }
            else if(user_input == 2){
                System.out.print("Enter the amount to Withdraw: ");
                int withdraw = input.nextInt();
                
                Withdraw(withdraw);

            }
            else if(user_input == 3){
                System.out.print("Amount persent in account: " + balance);


            }
            else if(user_input == 4){
                break;

            }

            else{

                System.out.println("You win 10000000000000 USD!!!");
            }
            
        }
        
    }


    public static void Deposit(int user_input) {
        
        balance = balance + user_input;
        
       

    }

    public static void Withdraw(int user_input) {

        if (balance - user_input > 0){
            
            balance = balance - user_input;
        }
        else{
            
            System.out.println("Sufficient fund is not avaiable!!");
          }
        
        
        
        

    }

}