import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> extensionCount = new HashMap<>();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String input = br.readLine();
            String[] parts = input.split("\\.");
   
            String extension = parts[1];
            extensionCount.put(extension, extensionCount.getOrDefault(extension, 0) + 1);
        }

        Map<String, Integer> sortedMap = new TreeMap<>(extensionCount);

        for (Entry<String, Integer> entry : sortedMap.entrySet()) {
            bw.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
    }

