import java.util.Scanner;



public class Lab_1_3{

    public static void main(String[] arg) {

        Scanner Morog = new Scanner(System.in);

        

        


        while (true){

            System.out.print("Input a number: ");
            int Number = Morog.nextInt();

            if(Number == 0){

                break;
            }

            else{

                if (Number % 2 == 0 ){
                    
                       System.out.println("Even");
                            
                    
                     }
                    
                else{
                    
                    System.out.println("odd");
                    
                }

            }

        }
   
    }


}