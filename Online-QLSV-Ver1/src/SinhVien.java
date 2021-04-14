/**
 * Muc dich: Quan ly sinh vien
 * Nguoi tao: Nguyen Duc Anh
 * Ngay tao: 14/4/2021
 * Version: 1.0
 */

import java.util.Scanner;

public class SinhVien {
    // 1. Thuoc tinh
    private String name;
    private String maSV;
    private float math;
    private float physics;
    private float chemistry;
    private float average;
    private String xepLoai;

    // 2. Constructor
    public SinhVien() {
        
    }

    public SinhVien(String _name, String _maSV, float _math, float _physics, float _chemistry) {
        this.name = _name;
        this.maSV = _maSV;
        this.math = _math;
        this.physics = _physics;
        this.chemistry = _chemistry;
    }
    // 3. Input, Output
    public void nhap(Scanner scan) {
        System.out.print("Nhap ten sinh vien: ");
        this.name = scan.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        this.maSV = scan.nextLine();
        System.out.print("Nhap diem toan: ");
        this.math = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap diem ly: ");
        this.physics = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap diem hoa: ");
        this.chemistry = Float.parseFloat(scan.nextLine());
    }

    public void xuat() {
        System.out.println("Sinh vien: " + this.name + "\nMa sinh vien: " + this.maSV + "\nDiem trung binh: " + this.average + "\nXep loai: " + this.xepLoai);
    }
    // 4. Get, set methods
    public String getName() {
        return this.name;
    }
    public void setName(String _name) {
        this.name = _name;
    }
    public String getMaSV() {
        return this.maSV;
    }
    public void setMaSV(String _maSV) {
        this.maSV = _maSV;
    }
    public float getMath() {
        return this.math;
    }
    public void setMath(float _math) {
        this.math = _math;
    }
    public float getPhysics() {
        return this.physics;
    }
    public void setPhysics(float _physics) {
        this.physics = _physics;
    }
    public float getChemistry() {
        return this.chemistry;
    }
    public void setChemistry(float _chemistry) {
        this.chemistry = _chemistry;
    }
    public float getAverage() {
        return this.average;
    }
    public String getXepLoai() {
        return this.xepLoai;
    }
    // 5. Business methods 
    public void tinhDiem() {
        this.average = (this.math + this.chemistry + this.physics) / 3;
    }
    public void xepLoai() {
        if(this.average >= 8) {
            this.xepLoai = "Gioi";
        } else if(this.average >= 6.5) {
            this.xepLoai = "Kha";
        } else {
            this.xepLoai = "Trung Binh";
        }
    }
}