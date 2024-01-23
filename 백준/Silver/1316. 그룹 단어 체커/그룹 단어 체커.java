import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int N = sc.nextInt(); // n개의 입력값을 받는다
        int count = 0;// 마지막 몇개 프린트할지 설정

        for(int i =0; i< N; i++){// 입력환 단어들 하나씩 확인 하기위한 for문
            if(check()== true){//check()함수를 이용해서 ture면 카운트 올라가는 코드
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check(){ 
        boolean[] check = new boolean[26]; //all false인 boolean 배열 만들기
        int prev = 0; //초반비교대상 0으로 
        String str = sc.next(); //단어 입력 

        for(int i = 0; i < str.length(); i++){//단어의 첫번째 글자부터 for문ㄱㄱ
            int now = str.charAt(i);//첫번째 글자부터 now라는 변수에 넣기

            if(prev != now) { // 만약 prev변수랑 now변수가 일치하지 않을 경우

                if(check[now - 'a'] == false){ //a부터 시작 -97함으로써 특정 행렬 자리가false로 남은곳이면 트루로 바꿔주기
                    check[now - 'a'] = true;
                    prev = now; // now 변수에 들어있던 숫자는 prev로 옮겨가 다음 글자 코드 실행
                }

                else{
                    return false;//만약 다른 행렬 구간에서 중복되는 숫자가 있을 경우 최종적으로 false 
                }
            }
            continue; //만약 연속되는 글자가 있을 경우 무시하고 코드 진행
        }
        return true;// 만약 연속되고 다른곳에서 중복되지 않는다면 최종적으로 true

    }
}
//-------------------------------------------------------------------



