import java.util.*;

 
public class Main {
 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        HashMap<Integer,Integer> map3 = new HashMap<>();
        List<String> list = new ArrayList<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            map.put(a, 0); //1,2,4
            map3.put(i, a);
        }

        for (int i = 0; i < M; i++) {
            int check = sc.nextInt(); 
            map2.put(check, 0);
            if(map.containsKey(check)){
                count ++;
            }
        }
        for(int i = 0; i < N; i++){
            if(map2.containsKey(map3.get(i))){
                count2 ++;
            }
        }


        int newsize = map.size() - count; 
        int newsize2 = map2.size() - count2;

        System.out.println(newsize + newsize2);
        
		
	}
}