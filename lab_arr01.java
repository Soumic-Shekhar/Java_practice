import java.util.Scanner;

public class lab_arr01{
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] arr = new int[6];

        int sum = 0;
        float avg = 0;

        int max = 0;
        int flag = 0;

        for(int i = 0; i < arr.length; i++){

            System.out.print("Enter " + (i+1) + "'th number: ");
            arr[i] = input.nextInt();

        }

        for(int j = 0; j < arr.length; j++){

            sum = sum + arr[j];

        }

        avg = sum / arr.length;

        System.out.println("Sum = " + sum + " & avg = " + avg);

       

        for(int k = 0; k < arr.length; k++){

            if(arr[k] > avg){

                flag++;
                
            }

        }

        float perc = ((float) flag/arr.length) * 100;

        System.out.println("Percentage of number above average: " + perc + "%");
        
        
        
    }
}