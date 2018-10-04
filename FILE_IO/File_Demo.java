import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_Demo{
    public static void main(String[] args){
        
        File fp = new File("/home/soumic/Desktop");

        try{
            File fp_2 = new File(fp,"test.txt");
            PrintWriter pw = new PrintWriter(fp_2);
            pw.append("wtf");
            pw.append("\n omg");
            pw.flush();
            pw.close();
            Scanner input = new Scanner(fp_2);
            System.out.println(input.nextLine());
            input.close();
        }catch (Exception e){
            System.out.println("File operation Failed " + e );
            }

    }  
}