import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //입력값 받기
        double avg = 0; //평균 변수 0으로 설정

        double[] ary = new double[N]; //N만큼의 크기의 아레이 생성

        for(int i=0; i < N; i++){
            ary[i] = scanner.nextInt(); // 배열에 입력한 정수들 넣어주기 
        }
//-------------------------------------------------ary[] = 40, 80, 60
        Arrays.sort(ary); // ----> sort 후에 40, 60, 80 정렬
        int max = (int) ary[ary.length - 1]; //max라는 최댓값 변수 설정 ary[2]--> 80

        for(int j=0; j<N; j++){ // 0번째부터 2번째까지 
            ary[j] = (ary[j]/max)*100;// 새로운 ary만들기 
            avg += ary[j]; //변수에 값들 다 넣어서 더하기 
        }
        
        double realavg = avg/N; //다 넣은 값 평균 내기 

        System.out.print(realavg);  // 평균 프린트
        }
}
    

