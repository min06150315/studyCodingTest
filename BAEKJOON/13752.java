import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] k = new int[n];

		for (int i = 0; i < n; i++) {
			k[i] = sc.nextInt();
		}

		for (int m : k) {
			for (int i = 0; i < m; i++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
}
