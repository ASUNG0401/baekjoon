import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < num; i++){

            arr.add(sc.nextInt());
        }
 
        Collections.sort(arr);
        for(int i: arr){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
}
}