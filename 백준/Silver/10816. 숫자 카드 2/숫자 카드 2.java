import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 배열 입력
        int raw = sc.nextInt();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 첫 번째 배열에서 각 숫자의 등장 횟수를 계산
        for (int i = 0; i < raw; i++) {
            int num = sc.nextInt();
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 두 번째 배열 입력 및 결과 출력
        int col = sc.nextInt();
        for (int i = 0; i < col; i++) {
            int query = sc.nextInt();
            // query가 등장한 횟수를 출력, 없으면 0 출력
            bw.write(frequencyMap.getOrDefault(query, 0) + "\n");
        }

        bw.flush();
        sc.close();
    }
}
