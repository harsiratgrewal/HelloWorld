import java.util.Scanner;
public class Addition {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        int x = scnr.nextInt();
        int y = scnr.nextInt();
        int z = x + y;
        System.out.println(x + " + " + y + " = " + z);
        scnr.close();
    }
}
