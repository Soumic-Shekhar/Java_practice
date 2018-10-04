public class method01{


    public static int[] listofFactor(int a){
        int[] x = new int[n];

        for (int i = 1, j = 0; i <= n; i++ ){

            if(n % i == 0){x[j] = i; j++;}

            
        }
        
        
        
        return null;



    }

    public static int sumOfItems(int[] list) {

        int sum = 0;
        
        for (int i = 0; i < list.length; i++){

            sum = list[i] + sum;

        }
        
        return sum;
        
    }
   
    public static boolean isPrime (int a, int b) {
        

        return true;
    }


    public static int computeGCD(int a, int b){

        for (int i = a ; i > 1; i--){

            if((a % i == 0) && (b % i == 0)) return i;
            
        }

        return 1;

    }
    public static void main(String[] args) {

        int c = computeGCD(8, 12);

        System.out.println(c);
    
    }

}