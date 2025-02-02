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
        int cross = 1;
        int prev = 0;

        while(true){
            if(num <= prev + cross){ //2 1
                if(cross % 2 == 1){ // 홀수
                    System.out.println((cross - (num - prev -1)) + "/" + (num - prev));
                    break;
                }else{ // 짝수
                    System.out.println((num-prev) + "/" + (cross - (num - prev -1)));
                    break;
                }
                
            } else{
                prev += cross;
                cross ++;
            }
        }
    }
}
