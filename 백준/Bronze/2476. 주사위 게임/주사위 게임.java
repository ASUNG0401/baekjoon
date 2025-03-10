import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0; //가장 많은 상금
        int total = 0;  //현재 상금
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == b && b == c) {
                total = 10000 + a * 1000;
            } else if (a == b) {
                total = 1000 + a * 100;
            } else if (b == c) {
                total = 1000 + b * 100;
            } else if (c == a) {
                total = 1000 + c * 100;
            } else {
                total = Math.max(a, Math.max(b,c)) * 100;
            }
            max = Math.max(max, total);
        }
        System.out.print(max);
    }
}