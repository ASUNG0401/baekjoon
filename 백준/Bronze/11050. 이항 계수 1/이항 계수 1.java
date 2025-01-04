import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        if(num2 == 0 || num - num2 == 0){
            System.out.println("1");

        }else{
        System.out.println((factorial(num))/(factorial(num-num2) * factorial(num2)));
        }
    }

    public static int factorial(int num) {
        if (num == 1)
            return 1;
        else
            
            return num * factorial(num - 1);

}
}