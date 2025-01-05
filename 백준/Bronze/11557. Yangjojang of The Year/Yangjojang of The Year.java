import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        String temp2 = "";

        StringBuilder sb = new StringBuilder();
        
        int num = sc.nextInt();
        for(int i =0; i < num; i++){
            int sch = sc.nextInt();
            for(int j = 0; j < sch; j++){
                String name = sc.next();
                int soju = sc.nextInt();
                if(soju > temp){
                    temp = soju;
                    temp2 = name;
                }

            }

            sb.append(temp2).append("\n");
            
        }
        System.out.println(sb);
}
}