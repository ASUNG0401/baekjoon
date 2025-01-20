import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for(int i =1; i<= num; i++){
            q.add(i);
        }

        while(true){
            sb.append(q.poll());
            sb.append(" ");
            q.add(q.poll());
            if(q.size() == 1){
                break;
            }
        }
        if(num == 1){
            System.out.println("1");
        }else{
        sb.append(q.poll());
        System.out.println(sb);
        }

    }
}