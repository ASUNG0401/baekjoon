import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Stack<Integer> stack = new Stack<>();

        int num = sc.nextInt();
        int count = 1;

        for(int i =0; i < num; i++){
            int gual = sc.nextInt();
            stack.push(gual);   
        }
        // System.out.println(stack);

        int peek = stack.peek();
        // System.out.println(peek);

        for(int i =0; i< num; i++){
            if(peek < stack.peek()){
                peek = stack.peek();
                count ++;
            }
            stack.pop();
        }
        System.out.println(count);
    }
}