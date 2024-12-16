import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        br.close();

        if((num1 == (num2 + num3)) || (num2 == num1 + num3) || (num3 == num1 + num2)){
            bw.write(String.valueOf("1"));
        }else if((num1 == num2 * num3) || (num2 == num1 * num3) || (num3 == num1 * num2)){
            bw.write(String.valueOf("2"));
        }else{
            bw.write(String.valueOf("3"));
        }

        bw.flush();
        bw.close();
    }
}