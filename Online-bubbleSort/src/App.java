import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n, scan);
        xuatMang(a);
        a = bubbleSort(a);
        xuatMang(a);
    }

    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.print("Nhap n > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while(n < 0);
        return n;
    }

    public static int[] nhapMang(int n, Scanner scan) {
        int a[] = new int[n];
        for(int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        for(int pt : a) {
            System.out.print(pt + "\t");
        }
        System.out.print("\n");
    }

    public static int[] bubbleSort(int a[]) {
        for(int i = 0; i < a.length; ++i) {
            for(int j = a.length - 1; j > i; --j) {
                if(a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return a;
    }
}
