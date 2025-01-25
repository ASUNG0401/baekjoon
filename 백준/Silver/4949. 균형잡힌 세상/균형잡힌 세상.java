import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String sent = sc.nextLine();
            
            if(sent.equals(".")){
                break;
            }
            
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for(int i = 0; i < sent.length(); i++){
                char c = sent.charAt(i);

                if(c == '(' || c == '['){
                    stack.push(c);
                }
                
                if(c == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        isValid = false;
                        break;
                    }
                    stack.pop();
                } else if(c == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            
            if(isValid && stack.isEmpty()){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
