import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a+b-c);

        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        String newstr = str1 + str2;

   
        int intValue1 = Integer.parseInt(newstr);

        System.out.println(intValue1 -c);



}
}