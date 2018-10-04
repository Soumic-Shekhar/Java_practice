public class print_arr{

    public static void main(String[] args) {

        int[][] list = {{1,2,3,}, {3,4}, {6,7,8,9}};

        for(int i = 0; i < list.length; i++ ){

            for(int j = 0; j < list[i].length; j ++ ){

                System.out.print(list[i][j] + " ");

            }

            System.out.println();

        }
        
    }

}