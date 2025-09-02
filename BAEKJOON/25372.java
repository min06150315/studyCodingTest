import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];
        
        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
            bw.write((strArr[i].length() >= 6 && strArr[i].length() <= 9) ? ("yes") : ("no"));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
