import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Su dung constructor khong tham so
        SinhVien sV1 = new SinhVien(); // instance cua class SinhVien
        SinhVien sV2 = new SinhVien(); // instance cua class SinhVien
        sV1.name = "Duc Anh";
        sV1.email = "ducanhkhtn@gamil.com";
        sV2.name = "Huyen Linh";
        sV2.email = "linhsociu031205@gmail.com";
        System.out.println("Ten: " + sV1.name + " - Email: " + sV1.email);
        System.out.println("Ten: " + sV2.name + " - Email: " + sV2.email);
        
        // Su dung constructor co tham so
        System.out.print("Vui long nhap ten sinh vien: ");
        String name = scan.nextLine();
        System.out.print("Vui long nhap email sinh vien: ");
        String email = scan.nextLine();
        SinhVien sV3 = new SinhVien(name, email);
        System.out.println("Ten: " + sV3.name + " - Email: " + sV3.email);
    }
}
