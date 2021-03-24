import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapSoTien(scan);
        int tong = demSoDongTien(n);
        inTong(tong);
    }

    public static int nhapSoTien(Scanner scan) {
        int n;
        do {
            System.out.print("Vui long nhap so tien: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 0);
        return n;
    }

    public static int demSoDongTien(int n) {
        int tong;
        int tongMin = 9999;
        if (n == 2 || n == 1 || n == 5) {
            return 1;
        } else {
            for (int i = n / 2; i > 0; --i) {
                for (int j = n / 5; j >= 0; --j) {
                    int k = n - 2 * i - 5 * j;
                    if (k >= 0) {
                        if (i < j + k) {
                            break;
                        } else {
                            tong = i + j + k;
                            if (tong < tongMin) {
                                tongMin = tong;
                            }
                        }
                    }
                }
            }
        }
        return tongMin;
    }

    public static void inTong(int tong) {
        System.out.println("Vay so to tien nho nhat la: " + tong + " to");
    }
}