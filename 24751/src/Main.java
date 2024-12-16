import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        float input = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(100 / input));
        bw.newLine();
        bw.write(String.valueOf(100 / (100 - input)));

        bw.flush();
        bw.close();
    }
}