import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int raw = sc.nextInt();
        list = new int[raw];

        for(int i =0; i < raw; i++){
            int a = sc.nextInt();
            list[i] = a;
        }

        int col = sc.nextInt();
        int[] list2 = new int[col];
        for(int i =0; i < col; i++){
            list2[i] = 0;
        }
        Arrays.sort(list);


        for(int i =0; i < col; i++){
            int b = sc.nextInt();
            if(binarySearch1(b, 0, list.length-1) == 1){
                list2[i] +=1;
            }
        }
        

        for(int i =0; i < col; i++){
            System.out.println(list2[i]);
        }

    }
    public static int binarySearch1(int key, int low, int high) {
        int mid;
    
        if(low <= high) {
            mid = (low + high) / 2;
    
            if(key == list[mid]) { // 탐색 성공 
                return 1;
            } else if(key < list[mid]) {
                // 왼쪽 부분 arr[0]부터 arr[mid-1]에서의 탐색 
                return binarySearch1(key ,low, mid-1);  
            } else {
                // 오른쪽 부분 - arr[mid+1]부터 arr[high]에서의 탐색 
                return binarySearch1(key, mid+1, high); 
            }
        }
    
        return -1; // 탐색 실패 
    }
}
