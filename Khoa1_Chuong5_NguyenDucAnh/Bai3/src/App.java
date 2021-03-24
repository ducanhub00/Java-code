import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n, scan);
        int sum = tinhTongLe(a);
        System.out.println("Tong cac so le trong day la: " + sum);
    }

    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.print("Vui long nhap n > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while(n < 0);
        return n;
    }

    public static int[] nhapMang(int n, Scanner scan) {
        int a[] = new int[n];
        for(int i = 0; i < n; ++i) {
            do {
                System.out.print("Vui long nhap a[" + i + "] > 0: ");
                a[i] = Integer.parseInt(scan.nextLine());
            } while(a[i] < 0);
        }
        return a;
    }

    public static int tinhTongLe(int a[]) {
        int sum = 0;
        for(int i = 0; i < a.length; ++i) {
            if(a[i] % 2 != 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}
