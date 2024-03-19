import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[b];

        for(int s =0; s< num; s++){
            int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
            for(int n = i-1; n < j; n++){
                arr[n] =k;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}



