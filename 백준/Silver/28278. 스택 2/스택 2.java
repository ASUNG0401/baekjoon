import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int nums = Integer.parseInt(input[0]);

            if (nums == 1) {
                int add = Integer.parseInt(input[1]);
                stack.push(add);
            } else if (nums == 2) {
                if (!stack.isEmpty()) {
                    bw.write(stack.pop() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (nums == 3) {
                bw.write(stack.size() + "\n");
            } else if (nums == 4) {
                if (stack.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else {
                if (!stack.isEmpty()) {
                    bw.write(stack.peek() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }

        bw.flush(); 
        bw.close();
        br.close();
    }
}
