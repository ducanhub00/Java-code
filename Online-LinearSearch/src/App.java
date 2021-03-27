import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n, scan);
        xuatMang(a, n);
        System.out.print("Nhap so can tim kiem x = "); 
        int x = Integer.parseInt(scan.nextLine());
        boolean found = binarySearch(a, x); // muon thuc hien binarySearch mang phai dc sap xep tang hoac giam dan
        if(found) {
            System.out.println("Tim thay x = " + x + " trong mang");
        } else {
            System.out.println("Khong tim thay x = " + x + " trong mang");
        }
        // int index = linearSearch1(a, x);
        // if(index != -1) {
        //     System.out.println("Tim thay x = " + x + " trong mang");
        // } else {
        //     System.out.println("Khong tim thay x = " + x + " trong mang");
        // }
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
    /* Binary search */
    public static boolean binarySearch(int a[], int x) {
        int left = 0;
        int right = a.length - 1;
        int mid;
        do {
            mid = (right + left) / 2;
            if(a[mid] == x) {
                return true; // tim thay
            } else if(a[mid] < x) {
                left = mid + 1; // x nam o ben phai
            } else {
                right = mid - 1;
            }
        } while(left <= right);
        return false;
    }
    /* End */

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
