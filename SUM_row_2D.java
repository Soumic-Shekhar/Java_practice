import java.util.Scanner;

public class SUM_row_2D{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


         int min = 0;
         int max = 99;

        int[] nsum = new int [10];

        

        //int n = (int) (min + Math.random() * (max - min + 1));
        int sum_row = 0, sum_column = 0, sum_diag1 = 0, sum_diag2 = 0;
        int[][] mat = new int [3] [3];

        for (int i = 0; i < mat.length; i++){

            for (int j = 0; j < mat[i].length; j++){

                mat[i][j] = input.nextInt();
            }


        }


        for(int k = 0; k < mat.length; k++){

            for(int l = 0; l < mat[k].length; l++){

                sum_row = sum_row + mat[k][l];
                //nsum[k] = sum;
                
            }

            System.out.println("SUM of row " + k + " is: " + sum_row);
            sum_row = 0;
        }

        for(int k = 0; k < mat.length; k++){
            
            for(int l = 0; l < mat[k].length; l++){
            
                sum_column = sum_column + mat[l][k];
                
                            
            }
            
            System.out.println("SUM of column " + k + " is: " + sum_column);
            sum_column = 0;
        }

        for (int i = 0; i < mat.length; i++ ){

            sum_diag1 = sum_diag1 + mat[i][i];


        }

        System.out.println("SUM of diagonal 1"+ " is: " + sum_diag1);

        for (int i = (mat.length-1); i >= 0; i-- ){
            
                sum_diag2 = sum_diag2 + mat[i][i];
            
            
        }
            
        System.out.println("SUM of diagonal 2"+ " is: " + sum_diag2);



        // great = nsum[0];
        // for(int m = 0; m < nsum.length; m++){

            
        //     if (nsum[m] > great){

        //         great = nsum[m];
        //         r = (m+1);

        //     }
        // }

        // System.out.println("Sum with the greatest row is: " + r);

        
    }


}