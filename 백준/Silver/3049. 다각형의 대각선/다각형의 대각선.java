import java.util.Scanner;
 
    public class Main {
     
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
     
            int n = in.nextInt();
            if(n == 3){
                System.out.println("0");
            } else System.out.println(n*(n-3)*(n-2)*(n-1)/24);
            
        }
    }
    