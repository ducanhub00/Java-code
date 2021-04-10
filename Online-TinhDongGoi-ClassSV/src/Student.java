import java.util.jar.Attributes.Name;

public class Student {
    // thuoc tinh/bien thanh vien/ data members
    private String name;
    private String email;
    private float math;
    private float physics;
    private float chemistry;
    private float averageScore;

    //constructor
    public Student() {

    }

    // get, set methods
    // accessor methods(phuong thuc truy xuat cac thuoc tinh/ bien thanh vien)
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public float getMath() {
        return this.math;
    }

    public float getPhysics() {
        return this.physics;
    }

    public float getChemistry() {
        return this.chemistry;
    }

    public float getAverage() {
        return this.averageScore;
    }

    // phuong thuc thiet lap cac gia tri cac thuoc tinh/ bien thanh vien
    public void setName(String _name) {
        this.name = _name;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public void setMath(float mathScore) {
        this.math = mathScore;
    }

    public void setPhysics(float physicScore) {
        this.physics = physicScore;
    }

    public void setChemistry(float chemistryScore) {
        this.chemistry = chemistryScore;
    }

    public void tinhDiemTB() {
        this.averageScore = (this.chemistry + this.math + this.physics) / 3;
    }
}