import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 그래프를 인접 리스트로 표현 (각 노드가 연결된 리스트를 저장)
        List<List<Integer>> graph = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a*100 >= b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
