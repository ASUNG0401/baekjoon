import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String num = sc.nextLine();
            StringBuilder sb = new StringBuilder();

            String[] arr = num.split(":");
            long num1 = Integer.parseInt(arr[0]);
            long num2 = Integer.parseInt(arr[1]);


            System.out.println(sb.append(num1/gcd(num1, num2)).append(":").append(num2/gcd(num1, num2)));
            
      
        
    }
    // public static int solution(int[] arr) {
    //     int answer = 0;

    //     if(arr.length == 1) return arr[0]; //원소가 한 개인 경우 바로 출력

    //     int g = gcd(arr[0], arr[1]); //처음 두 원소의 최대공약수
    //     answer = (arr[0] * arr[1]) / g; //처음 두 원소의 최소공배수

    //     return answer;
    // }

    public static long gcd(long a, long b) {
            long r = a % b;
            if(r == 0) return b;
            else return gcd(b, r);
    }
    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}


