import java.util.Scanner;

/**
 *  Muc dich: Quan ly HCN
 *  Nguoi tao: Nguyen Duc Anh
 *  Ngay tao: 10/4/2021
 */

public class HinhChuNhat {
    // 1. Cac thuoc tinh
    private float chieuDai;
    private float chieuRong;
    private float chuVi;
    private float dienTich;

    // 2. Cac phuong thuc get, set
    public float getChieuDai() {
        return this.chieuDai;
    }

    public void setChieuDai(float cDai) {
        this.chieuDai = cDai;
    }

    public float getChieuRong() {
        return this.chieuRong;
    }

    public void setChieuRong(float cRong) {
        this.chieuRong = cRong;
    }

    public float getChuVi() {
        return this.chuVi;
    }

    public float getDienTich() {
        return this.dienTich;
    }

    // 3. Cac phuong thuc khoi tao (Constructor)
    // Constructor khong tham so
    public HinhChuNhat() {

    }

    //Constructor co tham so
    public HinhChuNhat(float cDai, float cRong) {
        this.chieuDai = cDai;
        this.chieuRong = cRong;
    }

    // 4. Cac phuong thuc nhap, xuat
    public void nhap(Scanner scan) {
        System.out.print("Nhap chieu dai: ");
        this.chieuDai = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap chieu rong: ");
        this.chieuRong = Float.parseFloat(scan.nextLine());
    }

    public void xuat() {
        System.out.println("HCN(" + this.chieuDai + ", " + this.chieuRong + ") \t Dien tich: " + this.dienTich + "\t Chu vi: " + this.chuVi);
    }

    // 5. Cac phuong thuc xu ly nghiep vu lien quan den phuong thuc nay
    public void tinhChuVi() {
        this.chuVi = (this.chieuDai + this.chieuRong) * 2;
    }

    public void tinhDienTich() {
        this.dienTich = this.chieuDai * this.chieuRong;
    }
}
