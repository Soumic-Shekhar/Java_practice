
public class cascade_number{

    public static void main(String[] arg) {

        int min = 5;
        int max = 20;

        int n = (int) (min + Math.random() * (max - min + 1));

        for (int i = n; i > 0; i--){

            for (int j = 1; j < i ; j++){

                System.out.print(j + " ");

            }

            System.out.println();


        }
        
    }


}



