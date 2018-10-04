//import com.sun.org.apache.xpath.internal.operations.String;

public class star_plus{

    public static void main(String[] args) {
        int min = 5;
        int max = 20;

        int num = (int) (min + Math.random() * (max - min + 1));

        for (int i = 1; i < num ; i++ ){

            

                for (int j = 1; j <= (2*i -1) ; j++ ){

                    if(i % 2 == 0){

                        System.out.print("+");

                    }

                    else{
                        
                    
                        
                        System.out.print("*");
                    }
                        

                }

            System.out.println();
            

            }

            System.out.println();
        }

            
        
        
    }
