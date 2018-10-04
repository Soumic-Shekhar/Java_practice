import java.util.Scanner;

public class String_args{
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String user_input = input.next();
        

        int c = StringArgs(user_input.toLowerCase());
        

        System.out.println(c);
        
    }

    public static int StringArgs(String user_input){

        int flag = 0;
        
        for (int i = 0; i < user_input.length(); i++){

            if (user_input.charAt(i) == 'a'
            || user_input.charAt(i) == 'e'
            || user_input.charAt(i) == 'i' 
            || user_input.charAt(i) == 'o'
            || user_input.charAt(i) == 'u' ){

                flag++;
            }


        }


        
        return flag;

    }


}