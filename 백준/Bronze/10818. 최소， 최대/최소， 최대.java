import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //입력값 받기

        int[] ary = new int[N]; //N만큼의 크기의 아레이 생성

        for(int i=0; i < N; i++){
            ary[i] = scanner.nextInt(); // 배열에 입력한 정수들 넣어주기 
        }
        Arrays.sort(ary); // 배열의 원소값을 오름차순으로 정렬
        System.out.print(ary[0]+ " " + ary[N-1]); //원소 첫번째 숫자+공백+원소 마지막 숫자
        }
}
    

