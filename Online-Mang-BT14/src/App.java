import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(scan, n);
        xuatMang(a);
        boolean flag = ktDoiXung(a);
        if(ktDoiXung(a)) {
            System.out.println("Mang doi xung");
        } else {
            System.out.println("Mang khong doi xung");
        }
        System.out.print("Vui long nhap k: ");
        int k = Integer.parseInt(scan.nextLine());
        System.out.println("\n");
        dichTraiXoayVong(a, k);
        xuatMang(a);
    }

    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.print("Vui long nhap n > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while(n < 1);
        return n;
    }

    public static int[] nhapMang(Scanner scan, int n) {
        int a[] = new int[n];
        for(int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "]" + " = ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        for(int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");
    }

    public static boolean ktDoiXung(int a[]) {
        for(int i = 0; i < a.length / 2; ++i) {
            if(a[i] != a[a.length - 1 -i]) {
                return false;
            }
        }
        return true;
    }

    public static void dichTraiXoayVong(int a[], int k) {
        int a0;
        while(k != 0) {
            a0 = a[0];
            for(int i = 0; i < a.length - 1; ++i) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = a0;
            k--;
        }
}
