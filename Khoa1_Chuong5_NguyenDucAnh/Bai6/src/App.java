import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int soNam = tinhSoNam(scan);
        System.out.println("Vay so nam anh ta phai cho doi la: " + soNam);
    }

    public static float nhap(Scanner scan) {
        float n;
        do {
            n = Float.parseFloat(scan.nextLine());
        } while(n < 0);
        return n;
    }

    public static int tinhSoNam(Scanner scan) {
        float tienGui, giaOto, laiSuat;
        int soNam = 0;
        System.out.print("Vui long nhap tien tiet kiem: ");
        tienGui = nhap(scan);
        System.out.print("Vui long nhap lai suat: ");
        laiSuat = nhap(scan);
        System.out.print("Vui long nhap gia Oto: ");
        giaOto = nhap(scan);
        laiSuat /= 100;
        do {
            tienGui += tienGui * laiSuat;
            soNam++;
        } while(tienGui < giaOto);
        return soNam;
    }
}
