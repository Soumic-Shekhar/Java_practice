import java.util.Scanner;

public class Task_1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Sum = 0;
        int count = 0;
        

        while(count< 10){

            try{
                System.out.print("Enter number: ");
                int num = input.nextInt();
                if(num < 0) throw new ArithmeticException("Neg not accepted!");

                else{
                    Sum = Sum + num;
                    count++;
                }
            }
            catch (Exception e){
                System.out.println("Error" + e);
            }
        }

        System.out.println("Sum of numbers: " + Sum);
        input.close();
    }


}