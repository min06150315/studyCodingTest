import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main {
	public static void main(String args[]) throws IOException {
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		char[] cNums = str.toCharArray();

		for (int i = 0; i < cNums.length; i++) {
			sum += cNums[i] - '0';
		}
 
		bw.write(String.valueOf(sum));
		bw.flush();	
		bw.close();
	}
	
}
