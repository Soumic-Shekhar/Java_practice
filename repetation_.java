import java.util.Scanner;





public class repetation_{

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            
            int sum = 0;
            int num;

            do{

                System.out.print("Enter a number: "); 
                
                num = input.nextInt(); 
                sum += num;                

            }

            while(num != 0);

            System.out.println("Sum = " + sum);    
            

            
        }


}