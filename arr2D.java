public class arr2D{

    public static void main(String[] args) {

        double [] [] mat;


        mat = new double [3] [4];

        for (int i = 0; i < 3; i++){

            System.out.println();
            System.out.print("[ ");

            for (int j = 0; j < 4; j++ ){

                System.out.print( mat[i][j] + " ");

            }
            System.out.print("]");
        }
        
    }

}