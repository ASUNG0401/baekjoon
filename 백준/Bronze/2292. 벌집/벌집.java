import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cnt = 1;
        int range = 2;

        if (N == 1) {
            System.out.print(1);
        }

        else {
            while (range <= N) {
                range = range + (6 * cnt);
                cnt++;
            }
            System.out.print(cnt);
        }
    }
}