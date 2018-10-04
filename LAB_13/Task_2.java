import java.util.Scanner;

public class Task_2{
    public static void main(String[] args){
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 10000);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the index you want to access: ");
        int usr_in = input.nextInt();

        try{
            System.out.println("Result: " + (usr_in - 1));
        }catch (Exception e){
            System.out.println("Error" + e);
        }

        input.close();

    }
}