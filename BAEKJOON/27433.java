import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				int n = Integer.parseInt(br.readLine());
				long res = 1;
				if (n == 0) {
					bw.write(String.valueOf(res));
				} else {
					for (int i = 1; i <= n; i++) {
						res *= i;
					}
					bw.write(String.valueOf(res));
				}
        bw.flush();
        bw.close();
    }
}
