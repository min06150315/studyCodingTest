import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int T = Integer.parseInt(st.nextToken());
	    int S = Integer.parseInt(st.nextToken());
	    
	    int res = 0;
	    
	    if (T >= 12 && T <= 16) {
	        if (S == 1) {
	            res = 280;
	        } else {
	            res = 320;
	        }
	    } else {
	        res = 280;
	    }
	    bw.write(String.valueOf(res));
	    bw.flush();
	    bw.close();
	}
}
