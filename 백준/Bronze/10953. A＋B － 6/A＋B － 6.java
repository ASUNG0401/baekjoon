import java.util.Scanner;
 
    public class Main {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            for(int i=0; i <N; i++){
                String asd = sc.next();
                int num1 = asd.charAt(0) - '0';
                int num2 = asd.charAt(2) - '0';
                System.out.println(num1+num2);
            }
            
        }
    }
    