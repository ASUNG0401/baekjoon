import java.util.*;


public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            map.put(name, sc.next());
            if(map.get(name).equals("leave")){
                map.remove(name);
            }
        }
        
        ArrayList<String> list = new ArrayList<String>(map.keySet()); 
		Collections.sort(list, Collections.reverseOrder()); 
		for(int i = 0; i < list.size(); ++i) System.out.println(list.get(i));

	}
}