import java.util.Scanner;

public class max_value_arr{

    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        Scanner input = new Scanner(System.in);
        int user_input = input.nextInt();
        double []arr = new double[user_input];

        for(int i = 0; i < arr.length; i++){

            arr[i] = (int) (min + Math.random() * (max - min + 1));
        } 


        maxValue(arr);

        
    }

    public static void maxValue(double[] arr) {

        double max = 0;
        
        for(int i = 0; i < arr.length; i++){

            if (max < arr[i]){

                max = arr[i];
            }

        }
        
        System.out.println(max);

    }

}