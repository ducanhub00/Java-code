public class App {

    public static int timNhoNhat() {
        int sum = 0;
        int n = 0;
        do {
            n++;
            sum += n;
        } while(sum < 1000);
        return n;
    }

    public static void main(String[] args) {
        int n = timNhoNhat();
        System.out.print("So nho nhat ma 1 + 2 + ... + n > 1000 la: " + n + "\n");
    }
}