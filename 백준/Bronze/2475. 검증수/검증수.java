import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = (int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2) + (int) Math.pow(d, 2) + (int) Math.pow(e, 2);
        System.out.println(sum % 10);

}
}