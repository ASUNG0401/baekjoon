import java.util.*;

 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        int num =sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        int count = 0;
        for(int i = 0; i < num; i++){
            String book = sc.next();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > count){
                count = entry.getValue();
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == count){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        
	}
}