import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        StringBuffer sb = new StringBuffer(word);
        String reverse = sb.reverse().toString();

        if(word.equals(reverse)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}