public class enhanced_for{

    public static void main(String[] args) {

        int[][] list ={{1,2,3}, {3,4}, {5,6}};

        for(int[]c:list){

            for(int y: c){
               
            System.out.print(y+ " " );

            }

            System.out.println();
        }
        
    }


}