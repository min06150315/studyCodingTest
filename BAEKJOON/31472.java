import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    		int W = Integer.parseInt(br.readLine());
    		bw.write(String.valueOf((int)(Math.sqrt(W * 2) * 4)));
    		bw.flush();
    		bw.close();
    }
}
