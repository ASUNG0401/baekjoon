import java.util.*;
import java.util.Map.Entry;

 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        Map<Long,Long> map = new HashMap<>();
        long num =sc.nextLong();
        ArrayList<Long> list = new ArrayList<>();

        long count = 0;
        for(long i = 0; i < num; i++){
            long book = sc.nextLong();
            map.put(book, map.getOrDefault(book, (long) 0) + 1);
        }

        for(Entry<Long, Long> entry : map.entrySet()){
            if(entry.getValue() > count){
                count = entry.getValue();
            }
        }

        for(Entry<Long, Long> entry : map.entrySet()){
            if(entry.getValue() == count){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        
	}
}