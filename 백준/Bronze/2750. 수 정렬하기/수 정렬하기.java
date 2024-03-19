import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){

            arr[i]= sc.nextInt();
        }
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j+ 1);
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

}
    public static void swap(int[] arr, int idx1, int idx2) {
	int tmp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = tmp;
}
}