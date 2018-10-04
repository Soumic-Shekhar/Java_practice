import java.util.Scanner;

public class sum_series{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");

        int user_input = input.nextInt();

        double sum = calculateSum(user_input);

        System.out.println("Sum of the series " + sum );
        
    }

    public static double calculateSum(int user_input) {

        double sum = 0;
        
        for(int i = 1; i <= user_input; i++){
        
            if(i % 2 != 0){
        
                sum = sum + (1.0 / i);
                        
            }
        
            else if (i % 2 == 0){
        
                sum = sum - (1.0 / i);
                        
            }
        
        }

        return sum;
        
    }


}