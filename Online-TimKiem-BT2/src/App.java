import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(scan, n);
        xuatMang(a);
        lietKe(a);
    }
    
    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.print("vui long nhap vao n > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    public static int[] nhapMang(Scanner scan, int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        for (int pt : a) {
            System.out.print(pt + " ");
        }
        System.out.println("\n");
    }

    public static void lietKe(int a[]) {
        int indexMin = -1; // chua tim thay
        for(int i = 0; i < a.length; ++i) {
            if(a[i] < 0) {
                indexMin = i; // da tim thay 
                break;
            }
        }
        if(indexMin != -1) { // neu mang co so chan
            for(int i = indexMin + 1; i < a.length; ++i) {
                if(a[i] < a[indexMin]) {
                    indexMin = i;
                }
            }
            System.out.print("Cac so am nho nhat la " + a[indexMin] + " tai cac vi tri: ");
            for(int i = indexMin; i < a.length; ++i) {
                if(a[i] == a[indexMin]) {
                    System.out.print(i + "\t");
                }
            }
        } else {
            System.out.println("Mang khong co phan tu am");
        }
    }
}
