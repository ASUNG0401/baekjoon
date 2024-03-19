import java.util.Scanner;
public class Main {
    static int[] arr;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int num = sc.nextInt();
        arr = new int[b];
  
        for(int i =0; i< arr.length; i++){
            arr[i] = i+1;
        }
        for(int s =0; s< num; s++){
            int i = sc.nextInt(), k = sc.nextInt();
            swap(i-1, k-1);
            
        }
        

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void swap( int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}



