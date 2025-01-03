import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int N = in.nextInt();
        if(N == 0){
            System.out.println(1);
        } else {
        System.out.println(fact(N));
        }
    }

        public static long fact(long n) {

        if (n <= 1)
            return n;
        else 
            return fact(n-1) * n;
    }
}