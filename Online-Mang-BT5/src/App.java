import java.util.Scanner;

public class App {
    final static int MIN = -1000;
    final static int MAX = 1000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n);
        xuatMang(a);
        int tong = tinhTong(a);
        System.out.println(tong);
    }

    public static int nhapN(Scanner scan) {
        int n;
        n = Integer.parseInt(scan.nextLine());
        return n;
    }

    public static int [] nhapMang(int n){
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = MIN + (int)((Math.random()) * ((MAX - MIN) + 1));    
        }
        return a;
    }

    public static void xuatMang(int a[]){
        for (int pt : a){
            System.out.print(pt + "\t");
        }
        System.out.println("\n");
    }

    public static int tinhTong(int a[]){
        int tong = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i] > a[i - 1]){
                tong += a[i];
            }
        }
        return tong;
    }
}
