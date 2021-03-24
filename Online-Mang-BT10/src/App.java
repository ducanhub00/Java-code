import java.util.Scanner;

public class App {
    final static int MAX = 100;
    final static int MIN = -100;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = taoMang(n);
        int b[] = a;
        xuatMang(a);
        a = shuffle(a);
        xuatMang(a);
        b = shuffle(a);
        int count = countShuffle(a, b);
        System.out.println(count + " lan hoan doi");

    }

    public static int nhapN(Scanner scan){
        int n;
        do {
            System.out.print("Nhap n > 2 va n le: ");
            n = Integer.parseInt(scan.nextLine());
        } while(n < 2 || n % 2 != 0);
        return n;
    }

    public static int [] taoMang(int n){
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = MIN + (int)((Math.random()) * ((MAX - MIN) + 1));
        }
        return a;
    }

    public static void xuatMang(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");
    }

    public static int [] shuffle(int a[]){
        int tam[] = new int[a.length];
        for(int i = 0; i < a.length/2; i++){
            tam[2 * i] = a[i];
            tam[2 * i + 1] = a[a.length / 2 + i];
        }
        return tam;
    }

    public static boolean isEqual(int a[], int b[]){
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static int countShuffle(int a[], int b[]){
        int count = 0;
        while(!isEqual(a, b)){
            b = shuffle(b);
            xuatMang(b);
            count++;
        }
        return count;
    }

}
