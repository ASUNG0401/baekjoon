import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); 

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); 
            HashSet<Integer> notebook1 = new HashSet<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                notebook1.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                int query = Integer.parseInt(st.nextToken());
                sb.append(notebook1.contains(query) ? "1\n" : "0\n");
            }
        }

        System.out.print(sb);
    }
}
