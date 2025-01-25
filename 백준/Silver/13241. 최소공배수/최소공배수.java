import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(lcm(a,b));


        
    }
    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static long gcd(long num1, long num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return gcd(num2, num1 % num2);
    }
}
