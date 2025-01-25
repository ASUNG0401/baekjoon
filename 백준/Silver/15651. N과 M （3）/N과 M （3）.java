import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 총 몇번의 수까지 
        int M = sc.nextInt(); // 깊이는 어디까지 

        arr = new int[M]; // 해당하는 깊이만큼 배열 생성
        visit = new boolean[N]; // 방문여부 검사 하기 위해 N개만큼 bool배열 생성
        dfs(N, M, 0); // dfs를 통해 방문여부 및 재귀함수 호출

        System.out.print(sb); // 최종적으로 StringBuilder에 저장된 결과를 출력
    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) { // base case, 깊이가 M에 도달했을 경우
            for (int val : arr) { // 배열의 모든 요소를 StringBuilder에 추가
                sb.append(val).append(" ");
            }
            sb.append("\n"); // 줄바꿈 추가
            return; // 재귀 종료
        }

        for (int i = 0; i < N; i++) { // 총 N번의 깊이만큼 반복
            if (!visit[i]) { // 방문하지 않은 경우
                // visit[i] = true; // (중요) 조건이 같은 수를 여러 번 골라도 되기 때문에 true로 안바꾸어도 된다 
                arr[depth] = i + 1; // 배열에 깊이를 저장
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}