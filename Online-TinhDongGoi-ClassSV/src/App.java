import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // information student 1
        Student st1 = new Student();
        st1.setName("Duc Anh");
        st1.setEmail("ducanhkhtn@gmail.com");
        
        System.out.print("Vui long nhap diem toan: ");
        float toan = Float.parseFloat(scan.nextLine());
        st1.setMath(toan);

        System.out.print("Vui long nhap diem ly: ");
        float ly = Float.parseFloat(scan.nextLine());
        st1.setPhysics(ly);

        System.out.print("Vui long nhap diem hoa: ");
        float hoa = Float.parseFloat(scan.nextLine());
        st1.setChemistry(hoa);
        
        st1.tinhDiemTB();

        System.out.println("Ten: " + st1.getName() + " - Email: " + st1.getEmail() + "\n" + "Diem trung binh: " + st1.getAverage());
    }
}
