import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a == 1){
            a = 2;
        }
        for(long i = a; i <= b; i++){
            if(isPrime(i) == 1){
                System.out.println(i);
                // System.out.println("\n");
            }
        }
    }

    public static int isPrime(long i2) {
            for (int i = 2; i <= Math.sqrt(i2); i++) {
                if (i2 % i == 0) return 0;
        }
        return 1;
    }

}
