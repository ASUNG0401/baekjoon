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
            int nums = Integer.parseInt(input[0]);

            if (nums == 1) {
                int add = Integer.parseInt(input[1]);
                deque.addFirst(add);

            } else if (nums == 2) {
                int add = Integer.parseInt(input[1]);
                deque.addLast(add);

            } else if (nums == 3) {
                if(!deque.isEmpty()){
                    bw.write(deque.removeFirst() + "\n");
                }else{
                    bw.write("-1\n");
                }

            } else if (nums == 4) {
                if (!deque.isEmpty()) {
                    bw.write(deque.removeLast() + "\n");
                } else {
                    bw.write("-1\n");
                }

            } else if(nums == 5){
                bw.write(deque.size() + "\n");

            } else if(nums == 6){
                if(deque.isEmpty()){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
            } else if(nums ==7){
                if (!deque.isEmpty()) {
                    bw.write(deque.peekFirst() + "\n");
                } else {
                    bw.write("-1\n");
                }

            } else if(nums == 8){ 
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
