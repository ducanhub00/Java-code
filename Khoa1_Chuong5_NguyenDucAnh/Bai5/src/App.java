import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        long gt = tinhGiaiThua(n);
        System.out.println(n + "! = " + gt);
    }

    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.print("Vui long nhap n > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while(n < 0);
        return n;
    }

    public static long tinhGiaiThua(int n) {
        long gt = 1;
        if(n == 1 || n == 0) return 1;
        else {
            for(int i = 1; i <= n; ++i) {
                gt *= i;
            }
        }
        return gt;
    }
}
