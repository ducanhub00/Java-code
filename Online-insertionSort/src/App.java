import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n, scan);
        xuatMang(a, n);
        a = insertionSort(a);
        xuatMang(a, n);
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
            System.out.print("Vui long nhap a[" + i + "] = ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    public static void xuatMang(int a[], int n) {
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");
    }

    public static int[] insertionSort(int a[]) {
        int x, pos;
        for(int i = 1; i < a.length; ++i) { // coi nhu a[0] da duoc sap xep
            x = a[i]; // phan tu dang can chen
            pos = i - 1; // vi tri truoc phan tu can chen
            while((pos >= 0) && (a[pos] >= x)) { // tim vi tri chen
                a[pos + 1] = a[pos]; // doi vi tri sang phai
                pos--;
            }
            a[pos - 1] = x; // chen vao vi tri dung thu tu
        }
        return a;

    }
}
