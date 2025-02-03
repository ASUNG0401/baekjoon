import java.util.*;

 
public class Main {
 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		int M = sc.nextInt();
        for(int i = 0; i < N; i++){
            map.put(sc.next(), 1);
        }
        for(int i = 0; i < M; i++){
            String name2 = sc.next();
            map.put(name2, map.getOrDefault(name2, 0)+1);
            if(map.get(name2) == 2){
                list.add(name2);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
 
		
	}
}