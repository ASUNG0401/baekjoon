import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int totalch = 100;
        int totalju = 100;

        for(int i =0; i < round; i ++){
            int ch = sc.nextInt();
            int ju = sc.nextInt();
            if(ch > ju){
                totalju -= ch;
            }else if (ju > ch){
                totalch -= ju;
            }
        }
        System.out.println(totalch);
        System.out.println(totalju);
        
}
}