import java.util.Scanner;

public class BMI{

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Hight: ");
        float Height = input.nextFloat();

        System.out.print("Enter your Weight: ");
        float Weight = input.nextFloat();

        double BMI = Weight / (Height * Height);

        System.out.println(BMI);

        if (BMI < 16){

            
        }

        
    }


}