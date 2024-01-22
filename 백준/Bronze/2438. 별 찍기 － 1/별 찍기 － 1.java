import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Numstar = scanner.nextInt(); //별 갯수 입력

        scanner.close();

        for(int i=1; i <= Numstar; i++){// i==1 이니까 j가 1번까지만 별을 찍음 --> i==2 이니까 j가 2번까지만 별을 찍음 즉 더블 for문으로 다음 번째 정하기 
            for(int j=1; j<=i; j++){
                System.out.print("*"); // println대신 print를 씀으로써 글바꿈이나 스페이스 다 없애기 
            }
            System.out.println();
        }
    }
}
    