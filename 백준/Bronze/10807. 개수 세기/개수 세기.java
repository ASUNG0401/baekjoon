import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //입력값 받기 
        int[] ary = new int[N]; //N만큼의 크기의 아레이 생성
        int count = 0; // b랑 일치할때마다 갯수 올리는 변수 

        for(int i=0; i < N; i++){
            ary[i] = scanner.nextInt(); // 배열에 입력한 정수들 넣어주기 
        }
        int b =scanner.nextInt(); // 무슨 중복 숫자 원하는지 

        for(int j =0; j<ary.length; j++){
            if(b == ary[j]){
                count++;
            }

        }
        System.out.println(count);
    }
}
    