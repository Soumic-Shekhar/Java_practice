public class Rand_avg {

    public static void main(String[] args) {

        int min = 15;
        int max = 50;

        int a[] = new int [5];

        
         for (int i = 0; i < 5; i++){

              a[i] = (int) (min + Math.random() * (max - min + 1));
   
   
        }

        


        
    }
    
}