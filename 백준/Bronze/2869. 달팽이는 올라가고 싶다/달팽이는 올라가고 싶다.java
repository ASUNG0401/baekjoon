import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long v = sc.nextLong();
        long count = 0;

        long day = (v- b) / (a-b);
        if((v-b) % (a-b) != 0){
            day += 1;
        }
        
        System.out.println(day);
        
}
}