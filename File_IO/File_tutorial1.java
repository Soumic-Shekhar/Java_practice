import java.*;
//import java.io.File;
import java.util.Formatter;
import java.io.file;
import java.util.*;
public class File_tutorial1{

        // public static void main(String []args){

    //     final Formatter file_writter;

    //     try{
    //         file_writter = new Formatter("/home/soumic/Desktop/test_1.txt");
    //         System.out.println("New file created! test_1.txt");
    //     }catch(Exception e){
    //         System.out.println(e);
    //     }
    // }
    File fp = new File("Chineese.txt");

    public void openFile(){
        try{
            Scanner input = new Scanner(fp);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void readFile(){
        while(fp.hasNext()){
            String a = fp.next();
            String b = fp.Next();
            String c = fp.next();


        }
    }

}