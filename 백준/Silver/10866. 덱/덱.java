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
        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            String nums = input[0];

            if (nums.equals("push_front")) {
                int add = Integer.parseInt(input[1]);
                deque.addFirst(add);

            } else if (nums.equals("push_back")) {
                int add = Integer.parseInt(input[1]);
                deque.addLast(add);

            } else if (nums.equals("pop_front")) {
                if(!deque.isEmpty()){
                    bw.write(deque.removeFirst() + "\n");
                }else{
                    bw.write("-1\n");
                }

            } else if (nums.equals("pop_back")) {
                if (!deque.isEmpty()) {
                    bw.write(deque.removeLast() + "\n");
                } else {
                    bw.write("-1\n");
                }

            } else if(nums.equals("size")){
                bw.write(deque.size() + "\n");

            } else if(nums.equals("empty")){
                if(deque.isEmpty()){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
            } else if(nums.equals("front")){
                if (!deque.isEmpty()) {
                    bw.write(deque.peekFirst() + "\n");
                } else {
                    bw.write("-1\n");
                }

            } else if(nums.equals("back")){ 
                if (!deque.isEmpty()) {
                    bw.write(deque.peekLast() + "\n");
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
