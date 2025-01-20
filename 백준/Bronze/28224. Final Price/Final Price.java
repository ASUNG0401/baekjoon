import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int num = sc.nextInt();
        for(int i =0; i < num; i++){
            int num2 = sc.nextInt();
            sum += num2;
        }
        System.out.println(sum);
    }
}
