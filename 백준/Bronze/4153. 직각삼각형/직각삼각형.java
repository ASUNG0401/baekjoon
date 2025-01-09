import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int high = 0;
            int sqr = 0;

            if(n >= n2 && n >= n3){
                sqr = n2*n2 + n3*n3;
                high = n;
            }else if ( n2 >= n && n2 >= n3){
                high = n2;
                sqr = n*n + n3*n3;
            }else{
                high = n3;
                sqr = n*n + n2*n2;
            }
            if(n == 0 && n2 == 0 && n3 == 0){
                break;
            }
            if(sqr == high *high){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }

            
        }
        

    }
}