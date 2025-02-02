import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] list = new int[num];
        String[] input = br.readLine().split(" "); 

        for(int i =0; i < num; i++){
            int a = Integer.parseInt(input[i]);
            list[i] = a;
            }

        Arrays.sort(list);

        System.out.println(list[0] * list[list.length -1]);
   
    }
}
