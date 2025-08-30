import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, res;
		x = sc.nextInt();
		y = sc.nextInt();

		if (x == 0 || y == 0) {
			return;
		}

		res = x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);
		
		System.out.println(res);
	}
}
