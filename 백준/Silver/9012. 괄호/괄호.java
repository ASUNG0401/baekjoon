import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Stack<Character> stack = new Stack<>();

        int num = sc.nextInt();

        for(int i =0; i < num; i++){
            String gual = sc.next();
            for(int j =0; j < gual.length(); j++){
                
                if(gual.charAt(j) == ')'){
                    if(stack.isEmpty()){
                        stack.push('a');
                        break;
                    }else{
                        stack.pop();
                    }
                }else{stack.push('a');}

            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            stack.clear();
        }
}
}