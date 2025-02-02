import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();

        int count = 0;

        for(int i =0; i < 6; i++){
            String one = br.readLine();
            if(one.equals("W")){
                count++;
            }
        }

        if(count == 1 || count == 2){
            System.out.println("3");
        }else if (count == 3 || count == 4){
            System.out.println("2");
        }else if (count == 5 || count == 6){
            System.out.println("1");
        }else{
            System.out.println("-1");
        }


        



        
    }
}
