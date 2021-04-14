import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SinhVien st1 = new SinhVien();
        st1.nhap(scan);
        st1.tinhDiem();
        st1.xepLoai();
        st1.xuat();
    }
}
