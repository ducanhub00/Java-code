import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(n);
        xuatMang(a);
        System.out.print("Vui long nhap so x can tinh: ");
        int x = Integer.parseInt(scan.nextLine());
        lietKe(a, x);
    }   

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Vui long nhap n > 0: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

    public static void lietKe(int a[], int x) {
        int index = -1; // chua tim thay
        int b[] = new int[a.length];
        for(int i = 0; i < a.length; ++i) {
            b[i] = Math.abs(a[i] - x);
        }
        int max = 0;
        for(int i = 0; i < a.length; ++i) {
            if(b[i] > max) {
                max = b[i];
                index = i;
            }
        }
        System.out.println("Cac phan tu cach xa x = " + x + "nam o cac vi tri: ");
        for(int i = 0; i < a.length; ++i) {
            if(b[i] == b[index]) {
                System.out.print("(" + i + ", " + a[i] + ") \t");
            }
        }
    }
}
