import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		in.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
            for(int p=1; p<i; p++){
                System.out.print("*"); // println대신 print를 씀으로써 글바꿈이나 스페이스 다 없애기 
            }
			System.out.println();
		}
	}
}