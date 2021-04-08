public class SinhVien {
    public String name;
    public String email;
    //phuong thuc khoi tao mac dinh khong tham so
    // constructor khong tham so
    public SinhVien() {

    }

    //phuong thuc khoi tao su dung 2 tham so cho class SinhVien
    // truyen du lieu cho thuoc tinh
    // constructor co tham so

    public SinhVien(String _name, String _email) {
        this.name = _name; // this la dai dien cho instance duoc goi
        this.email = _email;
    }
}
