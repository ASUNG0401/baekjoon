import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt(); 
        int numitem = scanner.nextInt(); 
        int acttotal = 0;
 

        //
        for(int i=0; i < numitem; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            acttotal += a*b;
        }

        
        if(total == acttotal){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scanner.close();
    }
}
    