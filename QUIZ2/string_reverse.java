import java.util.Scanner;

public class string_reverse{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String user_input = input.next();
        
        String reverse = reverseString(user_input);
        System.out.println("Reverse of " + user_input + " is " + reverse                    + ".");
        
    }

    public static String reverseString(String user_input) {

        String reverse ="";
        for (int i = 1; i <= user_input.length(); i++){

            reverse = reverse + user_input.charAt(user_input.length() -             i); 

        }

        return reverse;
    }
}