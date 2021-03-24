import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(scan, n);
        xuatMang(a);
        inSLPTGiongNhau(a);
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

    public static int[] demPhanTu(int a[]) {
        int b[] = new int[a.length];
        for(int i = 0; i < a.length; ++i) {
            b[i] = 0;
            for(int j = 0; j < a.length; ++j) {
                if(a[i] == a[j]) {
                    if(j < i) {
                        break;
                    } else {
                        b[i]++;
                    }
                }
            }
        }
        return b;
    }

    public static void inSLPTGiongNhau(int a[]) {
        int b[] = demPhanTu(a);
        for(int i = 0; i < b.length; ++i) {
            if(b[i] != 0) {
                System.out.println(a[i] + " " + b[i]);
            }
        }
    }
}
