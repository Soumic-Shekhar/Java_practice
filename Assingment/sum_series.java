import java.util.Scanner;

public class sum_series{

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        int user_input = input.nextInt();

        float series_sum = 1;

        for (int i = 2; i < user_input + 3; i++){

            series_sum = series_sum +(1/(float)i);
            
        }

        System.out.println("Sum of the series till " + user_input + " is: " + series_sum);
        


    }


}