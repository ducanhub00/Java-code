import java.util.Scanner;

public class App {
    final static int MIN = -100;
    final static int MAX = 100;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n);
        xuatMang(a);
        a = xoaPhanTu(a, scan);
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

    public static int[] xoaPhanTu(int a[], Scanner scan) {
        int b[] = new int[a.length - 1];
        int index;
        do {
            System.out.print("Nhap vao so tu 0 den " + (a.length - 1) + " ");
            index = Integer.parseInt(scan.nextLine());
        } while (index < 0 || index >= a.length);
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (j == index) {
                j++;
            }
            b[i] = a[j];
            i++;
        }
        a = b;
        return a;
    }
}