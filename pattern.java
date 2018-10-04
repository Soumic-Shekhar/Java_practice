//import com.sun.org.apache.xpath.internal.operations.String;

public class pattern{
    
        public static void main(String[] args) {
    
                
    
            int loop = 5;

            for(int i = 1; i <= loop; i++){

                for (int j = 0; j< ( 2 * i - 1); j++){

                    if ((i % 2) == 0){

                        System.out.print("+");

                    }

                    else{

                        System.out.print("*");

                    }
                }

                System.out.println();

            }
                
            
            
        }
    

}