import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int higha = Integer.MIN_VALUE;
        int highb = Integer.MIN_VALUE;
        int lowa = Integer.MAX_VALUE;
        int lowb = Integer.MAX_VALUE;

        for(int i=0; i< num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > higha){
                higha = a;
            }
            if(b > highb){
                highb = b;
            }
            if(a < lowa){
                lowa = a;
            }
            if(b < lowb){
                lowb = b;
            }
        }

        System.out.println((higha - lowa) * (highb - lowb));
        
    }
}