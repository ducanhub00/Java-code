import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int x = nhapX(scan);
        long sum = tinhTong(n, x);
        System.out.println("Tong S(" + n + ") = " + sum);
    }

    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.print("Vui long nhap n > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while(n < 0);
        return n;
    }

    public static int nhapX(Scanner scan) {
        int n;
        do {
            System.out.print("Vui long nhap x > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while(n < 0);
        return n;
    }

    public static long tinhTong(int n, int x) {
        long sum = 0;
        int xCopy = x;
        while(n != 0) {
            sum += x;
            x *= xCopy;
            n--;
        }
        return sum; 
    }
}
