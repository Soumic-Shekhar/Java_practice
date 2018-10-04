import java.util.Scanner;

public class Guessing_Number{

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            int min = 0;
            int max = 10;
            
    
            int rand_num = (int) (min + Math.random() * (max - min + 1));

            int guess = 9000;
            System.out.print("Guess a number:  "); 

            while (guess != rand_num){

                
                guess = input.nextInt();

            

                if (guess < rand_num){
                    
                    System.out.println("guess is low!");
                    System.out.print("Guess a number:  ");
                    
                }
                    
                else if (guess > rand_num){
                    
                    System.out.println("guess is High!");
                    System.out.print("Guess a number:  ");
                    
                }
                


            }

            //System.out.println(rand_num);




        }


}