//import com.sun.org.apache.xpath.internal.operations.String;

public class random_leap{

    public static void main(String[] args) {
        
        int min = 1990;
        int max = 2020;
        String res = " is a leap year";
        String _res = " is not a leap year"; 

        int rand_year = (int) (min + Math.random() * (max - min + 1));

        if (rand_year % 400 == 0){

            System.out.println( rand_year + res );

        }

        else if ( rand_year % 4 == 0){

            System.out.println( rand_year + res );
        }

        else{

            System.out.println( rand_year + _res);


        }

    }

}
