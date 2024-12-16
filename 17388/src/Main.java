import java.io.*;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        br.close();

        if(s + k + h >= 100){
            bw.write("OK");
            bw.flush();
            bw.close();
            return;
        }

        int min = s;
        int[] arr = {s, k, h};

        for(int i = 1; i < 3; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        if(min == s){
            bw.write("Soongsil");
        }else if(min == k){
            bw.write("Korea");
        }else if(min == h){
            bw.write("Hanyang");
        }

        bw.flush();
        bw.close();
    }
}