import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();

        int num = Integer.parseInt(br.readLine());
        for(int i = 1; i <= num; i++){
            String line = br.readLine();
            System.out.println(i + ". " + line);
        }
        
    }
}
