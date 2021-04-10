import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // information student 1
        Student st1 = new Student();
        st1.setName("Duc Anh");
        st1.setEmail("ducanhkhtn@gmail.com");

        // information student 2
        String ten = scan.nextLine();
        String e = scan.nextLine();
        Student st2 = new Student();
        st2 = new Student(ten, e);
        
        System.out.println("Ten: " + st1.getName() + " - Email: " + st1.getEmail());
        System.out.println("Ten: " + st2.getName() + " - Email: " + st2.getEmail());
    }
}
