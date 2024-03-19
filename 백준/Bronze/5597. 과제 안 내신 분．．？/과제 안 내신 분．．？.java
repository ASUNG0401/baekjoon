import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int[] list = new int[31];
        for (int i = 1; i < 29; i++) {
            list[sc.nextInt()] = 1;
        }
        for (int k = 1; k < list.length; k++) {
            if (list[k] != 1) {
                System.out.println(k);
            }
        }
    }

}