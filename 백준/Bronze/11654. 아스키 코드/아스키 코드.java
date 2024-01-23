import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc라는 스캐너 변수 만들기

        char ch = sc.nextLine().charAt(0); //아스키 코드 문자 받고 
        int num = (int)ch;  //숫자로 변환

        System.out.println(num);
        sc.close();
//-------------------------------------------------------------------
    }
}
    

