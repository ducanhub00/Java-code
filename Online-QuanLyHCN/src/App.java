import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap(scan);
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.xuat();
    }
}
