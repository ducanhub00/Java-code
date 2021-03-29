import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(scan, n);
        xuatMang(a);
        int index = timPhanTuChanCuoi(a);
        if(index != -1) {
            System.out.println("Phan tu chan cuoi cung la: " + a[index] + " nam o vi tri: " + index);
        } else {
            System.out.println("Mang khong co phan tu chan");
        }
    }

    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.print("vui long nhap vao n > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    public static int[] nhapMang(Scanner scan, int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        for (int pt : a) {
            System.out.print(pt + " ");
        }
        System.out.println("\n");
    }

    public static int timPhanTuChanCuoi(int a[]) {
        int index = -1; // chua tim thay
        for(int i = a.length - 1; i >=0; --i) {
            if(a[i] % 2 == 0) {
                index = i;
                break;
            }
        }
        return index;
    }
}
