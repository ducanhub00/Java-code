import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static int nhapN(Scanner scan) {
        int n;
        System.out.print("Vui long nhap so dia can chuyen: ");
        do {
            n = Integer.parseInt(scan.nextLine());
        } while(n < 0);
        return n;
    }

    
}
