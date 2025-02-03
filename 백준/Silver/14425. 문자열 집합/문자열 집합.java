import java.util.*;

 
public class Main {
 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            map.put(sc.next(), 0);
        }
        int count = 0;
        for (int i = 0; i < M; i++) {
            if (map.containsKey(sc.next())){
                count++;
            }
        }
        System.out.print(count);
		
	}
}