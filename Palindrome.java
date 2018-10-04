import java.util.Scanner;

public class Palindrome{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String user_input = input.next();


        boolean check = Plaindrome(user_input.toLowerCase());

        System.out.println(check);

        
    }

    public static boolean Plaindrome(String user_input){
        
        char []arr = new char[user_input.length()];
        int flag = 0;
        
        for (int i = 0; i < user_input.length(); i++){

            arr[i] = user_input.charAt(user_input.length() - i - 1);            

        }

        for (int j = 0; j < user_input.length(); j++){

            if(arr[j] == user_input.charAt(j)){
                flag++;
            }

        }

        if(flag == user_input.length()){

            return true;
        }

        else{
            
            return false;

        }
        
        
    }
    
}