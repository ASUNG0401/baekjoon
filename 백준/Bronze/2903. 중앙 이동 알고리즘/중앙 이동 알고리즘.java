import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Stack<Character> stack = new Stack<>();

        long num = sc.nextLong();
        System.out.println((int)Math.pow(Math.pow(2, num) +1, 2));
    }
}