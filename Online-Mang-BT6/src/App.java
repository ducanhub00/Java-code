import java.util.Scanner;

public class App {
    final static int MAX = 20;
    final static int MIN = -20;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n);
        xuatMang(a);
        themPhanTu(a, scan);
    }

    public static int nhapN(Scanner scan) {
        int n;
        n = Integer.parseInt(scan.nextLine());
        return n;
    }

    public static int[] nhapMang(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = MIN + (int) ((Math.random()) * ((MAX - MIN) + 1));
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        for (int pt : a) {
            System.out.print(pt + "\t");
        }
        System.out.println("\n");
    }

    public static void themPhanTu(int a[], Scanner scan) {
        int k;
        do {
            System.out.println("Vui long nhap vao k tu 0 den " + a.length);
            k = Integer.parseInt(scan.nextLine());
        } while (k < 0 && k > a.length);
        System.out.print("Vui long nhap phan tu x can them x = ");
        int x = Integer.parseInt(scan.nextLine());
        int b[] = new int[a.length + 1]; // tao mang phu
        for (int i = 0; i < b.length; i++) {
            if (i < k) {
                b[i] = a[i];
            } else if (i == k) {
                b[i] = x;
            } else {
                b[i] = a[i - 1];
            }
        }
        a = b; // gan mang b vao a
        for (int pt : a) {
            System.out.print(pt + "\t");
        }
    }
}
