import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> map = new HashSet<>();
        
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            map.add(sc.next());
        }

        for (int i = 0; i < N - 1; i++) {
            map.remove(sc.next()); 
        }

        for (String key : map) {
            System.out.println(key);
            break; 
        }
    }
}