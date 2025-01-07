import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();;
        long y2 = sc.nextLong();
        long x3 = sc.nextLong();
        long y3 = sc.nextLong();

        long area = (x2 -x1)*(y3 - y1) - (y2 - y1)*(x3 - x1);
        // long b = Math.abs((y3-y2) / (x3 - x2));
        
        if(area > 0){
            System.out.println("1");
        }else if(area == 0){
            System.out.println("0");
        }else if(area < 0){
            System.out.println("-1");
        }

        
		
}
}