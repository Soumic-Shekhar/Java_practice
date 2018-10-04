import java.util.Scanner;

public class char_{

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Input: ");
        ch = (input.next()).charAt(0);
        System.out.println("\n" + ch);
    }

}