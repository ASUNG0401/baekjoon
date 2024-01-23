import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt(); // 시
        int M = in.nextInt(); // 분
        int reqM = in.nextInt(); // 필요한 시간
        in.close();

        int totalM = H * 60 + M; // 전체 분으로 변환

        totalM += reqM; // 필요한 시간을 더함

        H = totalM / 60; // 다시 시간으로 변환
        M = totalM % 60; // 다시 분으로 변환

        if (H >= 24) {
            H %= 24; // 24를 넘어가면 다시 0부터 시작
        }

        System.out.println(H + " " + M);
    }
}
