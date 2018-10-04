import java.util.Scanner;





public class rep_avg{

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            
            int sum = 0;
            int num;
            float count = 0;

            do{

                System.out.print("Enter a number: "); 
                
                count++; 
                num = input.nextInt(); 
                sum += num; 
                              

            }

            while(num != 0);

            System.out.println("Avg = " + sum/(count - 1));    
            

            
        }


}