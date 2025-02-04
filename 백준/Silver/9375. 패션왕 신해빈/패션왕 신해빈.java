import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args){
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        int n = sc.nextInt();
        for(int j = 0; j < n; j++){
            int a = sc.nextInt();
            int sum = 1;
            for (int i = 0; i < a; i++) {
                String itme = sc.next();
                map.put(itme, sc.next());
            }
            for (String value : map.values()) {
                map2.put(value, map2.getOrDefault(value, 0) + 1);
            }

            for (Entry<String, Integer> entry : map2.entrySet()) {
                sum *= entry.getValue()+1;
            }
            sum--;
            System.out.println(sum);
            map2.clear();
            map.clear();
        }
        
        
    }
    }

