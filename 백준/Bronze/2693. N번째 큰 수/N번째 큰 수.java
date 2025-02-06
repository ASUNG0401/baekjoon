import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> map = new HashSet<>();
        
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int[] list = new int[10];
            for(int j = 0; j < 10; j++) {
                int num = sc.nextInt();
                list[j] = num;
            }
            Arrays.sort(list);
            System.out.println(list[7]);
        }

    }
}
