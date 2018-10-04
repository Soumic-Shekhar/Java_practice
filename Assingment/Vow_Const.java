


import java.util.Scanner;

public class Vow_Const{
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char user_input = input.next().charAt(0);

        switch ((int)user_input){

            case 65: System.out.println("Vowel");
                break;
            case 69: System.out.println("Vowel");
                break;
            case 73: System.out.println("Vowel");
                break;
            case 79: System.out.println("Vowel");
                break;
            case 85: System.out.println("Vowel");
                break;
            case 97: System.out.println("Vowel");
                break;
            case 101: System.out.println("Vowel");
                break;
            case 105: System.out.println("Vowel");
                break;
            case 111: System.out.println("Vowel");
                break;
            case 117: System.out.println("Vowel");
                break;

            default: System.out.println("Consonant");


        }

        

        


        
    }


}