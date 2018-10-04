//import com.sun.org.apache.xpath.internal.functions.FuncTrue;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Monetary_unit{

    public static void main(String[] arg) {
        //System.out.print("Enter money: ");
        // Scanner input = new Scanner(System.in);
        // float money = input.nextFloat();

        String money = JOptionPane.showInputDialog(null,"Ente a number", "TEST", JOptionPane.INFORMATION_MESSAGE);
       

        // System.out.println(money+ "$");

        // int n = Integer.parseInt(money);

        // JOptionPane.showMessageDialog(null, n+54);
        //(float)money = (float)money * 100;

        //int dollar = (int)money / 100;

        //System.out.println(n);

        int k = JOptionPane.showConfirmDialog(null, "yes?");

        System.out.println(k);

    


        
    }



}