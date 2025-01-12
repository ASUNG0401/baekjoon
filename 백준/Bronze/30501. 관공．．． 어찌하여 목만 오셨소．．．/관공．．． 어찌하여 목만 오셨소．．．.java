import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 
        for(int i = 0; i < T; i++){
            String name  =  sc.next();
            for(int j = 0; j < name.length(); j++){
                if(name.charAt(j) == 'S'){
                    System.out.println(name);
                }else{
                    continue;
                }
            }
        }
    }
    }
