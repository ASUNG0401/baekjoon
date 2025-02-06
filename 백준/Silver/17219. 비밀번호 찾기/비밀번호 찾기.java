import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input2 = br.readLine().split(" ");
        
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < Integer.parseInt(input2[0]); i++) {
            String[] input = br.readLine().split(" ");
            String book = input[0];
            String book2 = input[1];
            map.put(book, map.getOrDefault(book, book2));
        }

        for (int i = 0; i < Integer.parseInt(input2[1]); i++) {
            String comp = br.readLine();
            if (map.containsKey(comp)) {
                sb.append(map.get(comp)).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}