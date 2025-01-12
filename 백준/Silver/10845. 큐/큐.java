import java.math.BigInteger;
import java.util.*;
 
public class Main {

    public static int[] queue;
	
    static int first = 0;
    static int last = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
            
        

        int N = sc.nextInt();
        queue = new int[N];

        for(int i = 0; i < N; i++) {
        
			String str = sc.next();

            switch (str) {
            
                case "push":  //push일 경우 숫자 입력값을 추가로 받음 
                    push(sc.nextInt());
                    break;
                    
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                    
                case "size":
                    sb.append(size()).append('\n');
                    break;
                    
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                    
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
                }
     
            }
            System.out.println(sb);
        }


 
        public static void push(int item) {
        queue[last] = item;	// size칸에 item을 넣고 size를 1증가 
        last++;
    }
 
    public static int pop() {
        // 데이터가 한 개도 없을 경우 -1
        if(last -first == 0) {
            return -1;
        }

        // 인덱스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치한다.
        else {
            int res = queue[first];
            first++;	// 0으로 초기화 해준다.
            return res;
	    }
    }
 
    public static int size() {
        return last - first;	// 요소 개수를 반환
        }
    
    public static int empty() {
        // 스택이 비어있으면 1 반환
        if(last - first == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public static int front() {
        // 데이터가 한 개도 없을 경우 -1
        if(last - first == 0) {
            return -1;
        }
    
        // 인덱스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치한다.
        else {
            int tmp = queue[first];
            return tmp;
        }
    }

    public static int back() {
        // 데이터가 한 개도 없을 경우 -1
        if(last - first == 0) {
            return -1;
        }
    
        // 인덱스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치한다.
        else {
            int temp = queue[last - 1];
            return temp;
        }
    }
}