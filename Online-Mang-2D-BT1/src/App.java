import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int soDong = nhapSoDong(scan);
        int soCot = nhapSoCot(scan);
        int a[][] = nhapMang2Chieu(soDong, soCot, scan);
        xuatMang(a, soDong, soCot);
        inRaTong(a, soDong, soCot);
    }

    public static int nhapSoDong(Scanner scan) {
        int n;
        do {
            System.out.print("Nhap vao so dong: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 0);
        return n;
    }

    public static int nhapSoCot(Scanner scan) {
        int n;
        do {
            System.out.print("Nhap vao so cot: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 0);
        return n;
    }

    public static int[][] nhapMang2Chieu(int soDong, int soCot, Scanner scan) {
        int a[][] = new int[soDong][soCot];
        for(int i = 0; i < soDong; ++i) {
            for(int j = 0; j < soCot; ++j) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        return a;
    }

    public static void xuatMang(int a[][], int soDong, int soCot) {
        for(int i = 0; i < soDong; ++i) {
            for(int j = 0; j < soCot; ++j) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void inRaTong(int a[][], int soDong, int soCot) {
        int tong = 0;
        for(int i = 0; i < soDong; ++i) {
            for(int j = 0; j < soCot; ++j) {
                tong += a[i][j];
            }
        }
        System.out.println("Tong cac phan tu trong mang: " + tong);
    }
}
