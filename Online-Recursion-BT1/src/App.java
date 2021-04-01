import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        thapHanoi(n, 'A', 'B', 'C');
    }

    public static int nhapN(Scanner scan) {
        int n;
        System.out.print("Vui long nhap so dia can chuyen: ");
        do {
            n = Integer.parseInt(scan.nextLine());
        } while(n < 0);
        return n;
    }

    public static void doi1cot(int n, char a, char b) {
        System.out.println("Chuyen dia thu " + n + " tu cot " + a + " sang cot " + b);
    }
    
    public static void thapHanoi(int n, char a, char b, char c) {
        if(n == 1) {
            doi1cot(1, a, c);
        } else {
            thapHanoi(n - 1, a, c, b);
            doi1cot(n, a, c);
            thapHanoi(n - 1, b, a, c);
        }
    }
}
