import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // su dung constructor k tham so
        /*HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap(scan);
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.xuat();*/
        
        // su dung constructor co tham so
        System.out.print("Nhap chieu dai: ");
        float cDai = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap chieu rong: ");
        float cRong = Float.parseFloat(scan.nextLine());
        HinhChuNhat hcn = new HinhChuNhat(cDai, cRong);
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.xuat();
    }
}
