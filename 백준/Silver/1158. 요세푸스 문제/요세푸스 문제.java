import java.util.*;
 
public class Main {

    public static int[] queue;
	
    static int first = 0;
    static int last = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        int k = sc.nextInt();

        for(int i =1; i <= num; i++){
            que.add(i);
        }
        sb.append("<");

        for(int j = 0; j < num; j++){
            for(int o = 0; o < k-1; o++){
                que.add(que.poll());
            }
            if(j == num -1){
                sb.append(que.poll());
            }else{
                sb.append(que.poll() + ", ");
            
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
