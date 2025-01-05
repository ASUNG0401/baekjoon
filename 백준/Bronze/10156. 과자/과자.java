import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = k * n;

        if(sum > m) {
            System.out.println(sum - m);
        }else {
            System.out.println("0");
        }

    
}
}