import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
 
public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 스캐너처럼 버퍼 리더로 SC 같이 만들기 
        StringTokenizer st; // 토크나이져 변수 만들기 
        double sumNumxScore = 0;
        double sumNum = 0;

        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine()); // 2o번 읽기 
            String object = st.nextToken(); // nextToken안에 지정하지 않았으니까 스페이스바를 기준으로 다음 단어 변수 설정
            double num = Double.parseDouble(st.nextToken()); // 숫자들을 nexttoken으로 받아서 소수점을 읽기 위해 더블로 써준 모습
            String alphabet = st.nextToken(); // 알파벳도 받아주고 
            double score = 0;

            //p가아닐때 체크 
            if(!(alphabet.equals("P"))){
                switch (alphabet){
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                    default:
                        break;
                }

                sumNumxScore +=(num*score);
                sumNum +=num;
                
            }
        }
        System.out.printf("%.6f", sumNumxScore/sumNum);
        br.close();
    }
}