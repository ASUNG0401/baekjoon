import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while(true){
            int x =  sc.nextInt();
            if(x == 0){
                break;
            }
            for(int i = x+1; i <=2*x; i++){
                if(isPrime(i) ==true){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
 
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;  
        if (n % 2 == 0) return false;  
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) { //홀수만 검사하기 위함 ㅇㅇ
            if (n % i == 0) return false;
        }
        return true;		
    }
}



    



