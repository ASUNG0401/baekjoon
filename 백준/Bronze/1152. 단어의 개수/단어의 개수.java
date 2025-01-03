import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc라는 스캐너 변수 만들기

        String st = sc.nextLine(); //문자 받기

        if (st.trim().isEmpty()) {
            System.out.println(0); // 단어 개수 0 출력
        } else {
            String[] stChange = st.trim().split("\\s+");
            int count = stChange.length; // 배열 길이가 단어 개수
            System.out.println(count); // 단어 개수 출력
        }

        sc.close();
//-------------------------------------------------------------------
    }
}
