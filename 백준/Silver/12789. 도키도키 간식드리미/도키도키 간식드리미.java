import java.util.*;

public class Main{
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int x = sc.nextInt();
        int count = 1;

            for(int j = 0; j < x; j++){
                int num = sc.nextInt();
                if(num == count){
                    count++;
                    while(!stack.empty() && stack.peek() == count){
                        stack.pop();
                        count++;
                        if(stack.empty() || stack.peek() != count){
                            break;
                        }
                    }
                }else{
                    stack.push(num);
                }
                // if(stack.peek() == count){
                //     stack.pop();
                //     count++;
                //     }
            }   

        for(int j = count; j <= x; j++){
            if(stack.peek() == j){
                stack.pop();
            }

        }

        if(stack.empty()){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }

}