import java.util.*;
import java.util.Map.Entry;

 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        // int num =sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        while(true){
        // for(int i = 0; i < num; i++){
            String book = sc.nextLine();
            if(book.equals("***")){
                break;
            }
            // String book2 = sc.next();
            map.put(book, map.getOrDefault(book, 0) + 1);
        // }
        // System.out.println(map);
        }

        int count = 0;
        for(Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() >= count){
                count = entry.getValue();
            }
        }

        for(Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == count){
                list.add(entry.getKey());
            }
        }
        if(list.size() == 1){
            System.out.println(list.get(0));
        }else{
            System.out.println("Runoff!");
        }
        // }
        // Collections.sort(list);
        // System.out.println(list.get(0));
        
    // int sum  = 0;
    // List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
    // entryList.sort(Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getKey().length()).thenComparing(Map.Entry::getKey));

    //     for(Map.Entry<String, Integer> entry : entryList){
    //         System.out.println(entry.getKey() + " " + entry.getValue());
    //     }
    // }
    // System.out.println("Grand Total: " + sum);
	}
    }
