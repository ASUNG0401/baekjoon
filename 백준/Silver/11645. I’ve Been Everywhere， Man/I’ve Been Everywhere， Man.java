import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> extensionCount = new HashMap<>();
        int num = Integer.parseInt(br.readLine());
        for(int k = 0; k < num; k++){

            int a = Integer.parseInt(br.readLine());

            for (int i = 0; i < a; i++) {
                String input = br.readLine();
                String[] parts = input.split("\\.");
    
                String extension = parts[0];
                extensionCount.put(extension, extensionCount.getOrDefault(extension, 0) + 1);
            }

            Map<String, Integer> sortedMap = new TreeMap<>(extensionCount);
            int count = 0;
            for (Entry<String, Integer> entry : sortedMap.entrySet()) {
                // bw.write(entry.getValue() + "\n");
                count++;
                
            }
            System.out.println(count);
            extensionCount.clear();
            
            bw.flush();
    }
            bw.close();
            br.close();
                    

    }
    }

