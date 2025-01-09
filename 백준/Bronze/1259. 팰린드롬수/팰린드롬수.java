import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            int num  = sc.nextInt();
            if(num == 0){
                break;
            }
            String word = Integer.toString(num);

            StringBuffer sb = new StringBuffer(word);
            String reverse = sb.reverse().toString();

            if(word.equals(reverse)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}