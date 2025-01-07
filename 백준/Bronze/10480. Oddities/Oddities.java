import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int num = sc.nextInt();
        for(int i =0; i < num; i++){
            int num2 = sc.nextInt();
            if(num2 % 2 == 0){
                System.out.println(num2 + " is even");
            }else{
                System.out.println(num2 + " is odd");
 
            }
        }

}
}