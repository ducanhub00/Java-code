import java.util.Scanner;

public class App {
    final static int MAX = 100;
    final static int MIN = -100;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n = nhapN(scan);
        int a[] = taoMang(scan, n);
        xuatMang(a);
        lietKe(a);
    }

    public static int nhapN(Scanner scan) {
        int n;
        n = Integer.parseInt(scan.nextLine());
        return n;
    }

    public static int[] taoMang(Scanner scan, int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
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

    public static int timChiSoDuongNhoNhat(int a[]) {
        int index = -1;
        if (index == -1) {
            System.out.println("Mang k co so duong");
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 0) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static int timSoDuongNhoNhat(int a[]) {
        int indexMIN = timChiSoDuongNhoNhat(a);
        for (int i = indexMIN; i < a.length; i++) {
            if (a[i] > 0 && a[i] < a[indexMIN]) {
                indexMIN = i;
            }
        }
        return indexMIN;
    }

    public static void lietKe(int a[]) {
        int index = timSoDuongNhoNhat(a);
        if (index == -1) {
            System.out.println("Mang khong co so duong");
        } else {
            for (int i = index + 1; i < a.length; i++) {
                if (a[i] == a[index]) {
                    System.out.println(i + "\t");
                }
            }
        }
    }
}