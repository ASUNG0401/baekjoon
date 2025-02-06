import java.util.*;
import java.util.Map.Entry;

 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        int num =sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

    
        for(int i = 0; i < num; i++){
            String book = sc.next();
            int point = sc.nextInt();
            map.put(book, map.getOrDefault(book, 0) + point);
        }
        // System.out.println(map);


        // for(Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue() == count){
        //         list.add(entry.getKey());
        //     }
        // }
        // Collections.sort(list);
        // System.out.println(list.get(0));
    
    // int sum  = 0;
    List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
    entryList.sort(Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getKey().length()).thenComparing(Map.Entry::getKey));
    
        for(Map.Entry<String, Integer> entry : entryList){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    // System.out.println("Grand Total: " + sum);
	}

