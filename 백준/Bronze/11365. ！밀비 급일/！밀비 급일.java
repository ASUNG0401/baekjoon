import java.util.*;

public class Main {
    static String sent = ""; // 초기화
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while (!"END".equals(sent)) { // 문자열 비교 수정
            sent = sc.nextLine();    // 입력 받기
            if ("END".equals(sent)) break; // END이면 종료

            for (int j = 0; j < sent.length(); j++) {
                stack.push(sent.charAt(j)); // 스택에 문자 추가
            }

            while (!stack.isEmpty()) {
                sb.append(stack.pop()); // 스택에서 문자 꺼내서 추가
            }
            System.out.println(sb); // 결과 출력
            sb.setLength(0); // StringBuilder 초기화
        }
    }
}
