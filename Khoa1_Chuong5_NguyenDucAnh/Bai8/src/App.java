import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float r = nhapLaiSuat(scan);
        float p = nhapVon(scan);
        int n = nhapThoiHan(scan);
        inThongTin(r, p, n);
        inTichLuyTungNam(r, p, n);
    }

    public static float nhapLaiSuat(Scanner scan) {
        System.out.print("Vui long nhap lai suat: ");
        float r = Float.parseFloat(scan.nextLine());
        return r;
    }

    public static float nhapVon(Scanner scan) {
        System.out.print("Vui long nhap von: ");
        float p = Float.parseFloat(scan.nextLine());
        return p;
    }

    public static int nhapThoiHan(Scanner scan) {
        System.out.print("Vui long nhap thoi han: ");
        int n = Integer.parseInt(scan.nextLine());
        return n;
    }

    public static void inThongTin(float r, float p, int n) {
        System.out.println("Lai suat: " + r * 100 + "%");
        System.out.println("Von ban dau: " + p);
        System.out.println("Thoi han: " + n);
    }

    public static float tinhLuyThua(int n, float luyThua) {
        for(int i = 0; i < n; ++i) {
            luyThua *= luyThua;
        }
        return luyThua;
    }
    public static void inTichLuyTungNam(float r, float p, int n) {
        System.out.println("Nam        Von");
        for(int i = 1; i <= n; ++i) {
            float tienLoi;
            tienLoi = p * tinhLuyThua(i - 1, (1 + r));
            System.out.print(i + "          ");
            System.out.println(Math.round(tienLoi * 10)/10d);
        }
    }
}