import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());

		int[][] A = new int[N + 1][N + 1];
		int[][] sum = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}		
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				// 구간 합 구하기
				sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + A[i][j];
			}
		}		

		for (int i = 0; i < quizNo; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken()); 
			int x2 = Integer.parseInt(st.nextToken()); 
			int y2 = Integer.parseInt(st.nextToken()); 

			// 구간 합 배열
			int res = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];
			bw.write(String.valueOf(res));
			bw.newLine();

		}
			bw.flush();
			bw.close();
	}
	
}
