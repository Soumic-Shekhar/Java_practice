public class random_print{

    public static void main(String[] args) {

        int min = 5;
        int max = 20;

        int n = (int) (min + Math.random() * (max - min + 1));

        System.out.println("random number: " + n);

        for (int i = 0; i <= n; i++){

            System.out.print(i);
            System.out.print(" ");

        }

        System.out.println("");
        
    }


}