import java.util.Scanner;

public class num_to_words{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int []arr = new int[3];

        for (int i = 0; i < 3; i++){

            arr[i] = input.nextInt();
        }
        
        

        String []numeric_words = {"zero", "one",  "two",  "three",  "four",  "five",  "six",  "seven",  "eight",  "nine"};

        

        for(int i = 0; i < arr.length; i++){

            System.out.print(numeric_words[arr[i]]);

        }

        
    }


}