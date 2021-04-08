public class App {
    public static void main(String[] args) {
        SinhVien sV1 = new SinhVien();
        SinhVien sV2 = new SinhVien();
        sV1.name = "Duc Anh";
        sV1.email = "ducanhkhtn@gamil.com";
        sV2.name = "Huyen Linh";
        sV2.email = "linhsociu031205@gmail.com";
        System.out.println("Ten: " + sV1.name + " - Email: " + sV1.email);
        System.out.println("Ten: " + sV2.name + " - Email: " + sV2.email);
    }
}
