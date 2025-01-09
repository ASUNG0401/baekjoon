import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 초기 숫자 결정
        int find = sc.nextInt(); // 뭘 찾아야 하는지 

        char cha = Integer.toString(find).charAt(0); // 찾아야 하는 숫자 char로 만들기
        int count = 0; // 최종 카운트 변수 설정

        for(int i =1; i <= n; i++){ // 1부터 초기 숫자까지 
            String tmp = Integer.toString(i); //템프테 숫자를 저장
            for(int j =0; j < tmp.length(); j++){   
                if(cha == tmp.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}