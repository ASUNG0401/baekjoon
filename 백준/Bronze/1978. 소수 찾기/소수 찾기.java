import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i = 0; i < num; i++){
            int num2 = sc.nextInt();
            if(isPrime(num2) == true){
                count++;
            }
            }

        System.out.println(count);
        }
            
        public static boolean isPrime(int n) {  //소수 판별 함수 
        if (n <= 1) return false;			// 1보다 작으면 false 반환
        for (int i = 2; i < n; i++) {		// 2보다 크고 n보다 작은 수로 나눈다.
            if (n % i == 0) return false;		// 만약 나누어 떨어지는 것이 있다면 false 반환
        }
        return true;				// 모두 나누고도 떨어지는 수가 없다면 true 반환
    }

}