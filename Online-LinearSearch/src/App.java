import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n, scan);
        xuatMang(a, n);
        System.out.print("Nhap so can tim kiem x = "); 
        int x = Integer.parseInt(scan.nextLine());
        boolean found = linearSearch(a, x);
        if(found) {
            System.out.println("Tim thay x = " + x + " trong mang");
        } else {
            System.out.println("Khong tim thay x = " + x + " trong mang");
        }
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

    public static int linearSearch1(int a[], int x) {
        for (int i = 0; i < a.length; ++i) {
            if(a[i] == x) {
                return i;
            }
        }
        return -1; // khong tim thay
    }

    public static boolean linearSearch(int a[], int x) {
        int n = a.length;
        int i = 0;
        while(i < n && a[i] != x) {
            i++;
        }
        if(i == n) return false;
        else return true;
    }
}
