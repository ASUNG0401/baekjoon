import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int count = 0;
        
		String text = sc.next();
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
}
}