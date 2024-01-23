import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc라는 스캐너 변수 만들기

        String st = sc.next(); // st라는 입력값 변수 만들기
        int n = sc.nextInt()-1; // chatAt()는 0번째부터 시작하기 때문에 -1을 붙여서 원하는 위치 설정

        System.out.println(st.charAt(n)); // st라는 글자 변수에서 n번째 글자를 추출

        sc.close();
//-------------------------------------------------------------------
    }
}
    

