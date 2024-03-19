import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
            }
        }
        System.out.println(count);
    }
}
