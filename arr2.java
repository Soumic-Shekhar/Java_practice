public class arr2{

    public static void main(String[] args){

        int[] a = {3,6,2,56,2};

        for(int c:a){

            System.out.print(c + " ");
        }

        java.util.Arrays.sort(a);

        System.out.println();

        for(int c:a){
            
            System.out.print(c + " ");
         }
        
    }

}