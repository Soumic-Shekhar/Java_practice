public class diagonal_average{

    public static void main(String[] args) {

        int [][]arr = new int [3][3];
        arr[0][0] = 5;
        arr[0][1] = 2;
        arr[0][2] = 9;

        arr[1][0] = 2;
        arr[1][1] = 2;
        arr[1][2] = 11;

        arr[2][0] = 3;
        arr[2][1] = 6;
        arr[2][2] = 4;
        
        findDiagonalAverage(arr);

        
    }


    public static void findDiagonalAverage(int [][]arr) {

        float prymaryDiagonal = 0;
        float secondaryDiagonal = 0;

        for(int i = 0; i < 3; i++){

            prymaryDiagonal = prymaryDiagonal + arr[i][i];
            
        }

        for(int i = 0 ,j = 2; i < 3 && j >= 0; i++, j--){

            secondaryDiagonal = secondaryDiagonal + arr[i][j];
            //System.out.println(secondaryDiagonal);
            
        }

        System.out.println("Average of primary Diagonal = " +                   (prymaryDiagonal/3) + " and Average of secondary Diagonal =" + (secondaryDiagonal/3.0));
        
    }

    
}