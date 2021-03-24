import java.util.Scanner;

public class App {
    final static int MIN = -100;
    final static int MAX = 100;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n);
        xuatMang(a);
        int dem = demSoPhanTu(a);
        System.out.println("so phan tu chia het cho 4 va co duoi la 6 la: " + dem);
        a = thayCacPhanTuLe(a);
        xuatMang(a);
    }

    public static int nhapN(Scanner scan) {
        int n;
        System.out.println("Nhap vao so n: ");
        n = Integer.parseInt(scan.nextLine());
        return n;
    }

    public static int[] nhapMang(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (MIN + ((Math.random()) * ((MAX - MIN) + 1)));
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        for (int pt : a) {
            System.out.print(pt + "\t");
        }
        System.out.println("\n");
    }

    public static int demSoPhanTu(int a[]) {
        int dem = 0;
        for (int pt : a) {
            pt = Math.abs(pt);
            if (pt % 4 == 0 && pt % 10 == 6) {
                dem++;
            }
        }
        return dem;
    }

    public static int[] thayCacPhanTuLe(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] *= 2;
            }
        }
        return a;
    }
}
