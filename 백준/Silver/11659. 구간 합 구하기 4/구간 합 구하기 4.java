import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] list = new int[n+1];
        list[0] = 0;
        
        for (int i = 0; i < n; i++) {
            list[i+1] = list[i] + sc.nextInt();
        }   


        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(list[b] - list[a-1]);
            }
        }
    }

