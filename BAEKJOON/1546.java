import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int [] nums = new int[n];

		String input = br.readLine();
		String[] strNums = input.split(" ");

		for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
		
		int sum = 0, max = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			sum += nums[i];
		}

		double res = (double) sum / max * 100 / n;
		bw.write(String.valueOf(res));
		bw.flush();	
		bw.close();
	}
	
}
