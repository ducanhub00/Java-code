import java.util.jar.Attributes.Name;

public class Student {
    // thuoc tinh/bien thanh vien/ data members
    private String name;
    private String email;

    // get, set methods
    // accessor methods(phuong thuc truy xuat cac thuoc tinh/ bien thanh vien)
    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    // phuong thuc thiet lap cac gia tri cac thuoc tinh/ bien thanh vien
    public void setName(String _name) {
        this.name = _name;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }
}