import java.util.*;
import java.util.Map.Entry;

 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();
        // int num =sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        while(true){
            // for(int i = 0; i < num; i++){
                String book = sc.nextLine();
                if(book.equals("0")){
                    break;
                }
                map.put(book, map.getOrDefault(book, 0) + 1);
            // }


            // for(Entry<Integer, Integer> entry : map.entrySet()){
            //     if(entry.getValue() == count){
            //         list.add(entry.getKey());
            //     }
            // }
            // Collections.sort(list);
            // System.out.println(list.get(0));
    }
    int sum  = 0;
    for(Entry<String, Integer> entry : map.entrySet()){
        System.out.println(entry.getKey() + ": " + entry.getValue());
        sum += entry.getValue();
    }
    System.out.println("Grand Total: " + sum);
	}
}