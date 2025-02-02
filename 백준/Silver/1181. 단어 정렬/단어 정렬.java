import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String[] list = new String[num];

        for(int i = 0; i < num; i++){
            list[i] = "tmp";
        }

        int count = 0;
        for(int i = 0; i < num; i++){
            String word = br.readLine();
            for(int j = 0; j < list.length; j++){
                if(list[j].equals(word)){
                    count++;
                }
            }
            if(count == 0){
                list[i] = word;
            }
            count = 0;
        }
  
        Arrays.sort(list); // 사전순으로 정렬
        Arrays.sort(list, Comparator.comparingInt(String::length)); // 오름차순 글자수로 

        for(int i = 0; i < num; i++){
            if(list[i].equals("tmp")){
                continue;
            }else{
                System.out.println(list[i]);
            }
        }


        
    }
}
