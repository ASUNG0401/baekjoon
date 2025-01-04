import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong(); //200
        long temp = 0;
        long count = 0;
    

        for(long i = 1; i <= num; i++){
            temp += i;
            count += 1;
            if(num < temp){
                count -= 1;
                break;
            }
            // temp += i;
            // count += 1;
        }
        System.out.println(count);
    }

    
}