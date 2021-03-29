public class App {
    public static void main(String[] args) {
        
    }

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Vui long nhap n: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1 || n % 2 != 0);
		return n;
	}

	public static int[] nhapMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) ((Math.random()) * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
}
