import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        while(true){
            if(a+b <= c){
                c -= 1;
            }
            if(b+c <= a){
                a -= 1;
            }
            if(c+a <= b){
                b -= 1;
            }
            if(a+b>c && b+c>a && c+a>b){
                break;
            }
        }
        System.out.println(a+b+c);
        
    }
}