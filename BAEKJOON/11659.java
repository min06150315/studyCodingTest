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

		int dataNum = Integer.parseInt(st.nextToken());
		int quizNum = Integer.parseInt(st.nextToken());

		int[] nums = new int[dataNum + 1];
		int[] sums = new int[dataNum + 1];

		// sums[0] = 0; // 자바가 기본적으로 배열을 0으로 초기화
		
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= dataNum; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			sums[i] = sums[i - 1] + nums[i];
		}


		for (int i = 0; i < quizNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int res = sums[b] - sums[a - 1];
			bw.write(String.valueOf(res));
			bw.newLine();
		}
		
		
		bw.flush();	
		bw.close();
	}
	
}
