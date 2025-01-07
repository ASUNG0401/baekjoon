import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        if(SumPrime(num, num2) == 0){
            System.out.println("-1");
        }else{
            System.out.println(SumPrime(num, num2));
            System.out.println(lowestPrime(num, num2));
        }
        }
            
    public static int lowestPrime(int n, int b) {  //소수 판별 함수 
        int temp = 0;;
        for (int i = n ; i <= b; i++) {		
            if(isPrime(i) == 1){
               temp += i;
               break; 
            }
        }
        return temp;			
    }

    public static int SumPrime(int n, int b) {
        int sum = 0;
        for (int i = n ; i <= b; i++) {		
            if(isPrime(i) == 1){
               sum += i;     
            }
        }
        return sum;	
    }


    public static int isPrime(int n) { 
        if (n <= 1) return -1;;			
        for (int i = 2; i < n; i++) {		
            if (n % i == 0) {
                return -1;		
            }
        }		
        return 1;
        
}
}