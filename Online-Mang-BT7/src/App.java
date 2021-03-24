import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n, scan);
        xuatMang(a);
        System.out.print("nhap vao so x can xoa x = ");
        int x = Integer.parseInt(scan.nextLine());
        System.out.println("\n");
        a = xoaPhanTuX(a, x);
        xuatMang(a);
    }

    public static int nhapN(Scanner scan) {
        int n;
        System.out.print("nhap vao so n > 0: ");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("\n");
        return n;
    }

    public static int[] nhapMang(int n, Scanner scan) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scan.nextLine());
            System.out.println("\n");
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");
    }

    public static int demPhanTu(int a[], int x) {
        int dem = 0;
        for (int pt : a) {
            if (pt == x) {
                dem++;
            }
        }
        return dem;
    }

    public static int [] xoaPhanTuX(int a[], int x) {
        int dem = demPhanTu(a, x);
        if (dem > 0) {
            int b[] = new int[a.length - dem];
            int j = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != x) {
                    b[j++] = a[i];
                    //j++;
                }
            }
            a = b;
        } else {
            System.out.println("khong co phan tu " + x + " trong mang");
        }
        return a;
    }
}