import java.util.*;

 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        Map<String,Integer> map3= new HashMap<>();
        int num =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        int count = 0;
        int count1 = 0;
        for(int i = 0; i < num; i++){
            String book = sc.next();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }
        for(int i = 0; i < num2; i++){
            String book = sc.next();
            map2.put(book, map2.getOrDefault(book, 0) + 1);
        }
        for(int i = 0; i < num3; i++){
            String book = sc.next();
            map3.put(book, map3.getOrDefault(book, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            for(Map.Entry<String, Integer> entry1 : map3.entrySet()){ 
                if(entry1.getKey().contains(entry.getKey())){
                    count += entry1.getValue();
                }
            }
        }
        // System.out.println(count);

        for(Map.Entry<String, Integer> entry : map2.entrySet()){
            for(Map.Entry<String, Integer> entry1 : map3.entrySet()){
                if(entry1.getKey().contains(entry.getKey())){
                    count1 += entry1.getValue();
                }
            }
        }
        // System.out.println(count1);
        if(count > count1){
            System.out.println("A");
        }else if(count < count1){
            System.out.println("B");
        }else{
            System.out.println("TIE");
        }
    }
}