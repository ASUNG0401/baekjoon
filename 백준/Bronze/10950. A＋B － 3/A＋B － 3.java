import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //테스트 할 만큼의 숫자 만들기, array의 길이 만들기 
        int c = scanner.nextInt(); 
        int ary[] = new int[c];

        for(int i=0; i < c; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ary[i] = a+b;
        }

        for(int k : ary){
            System.out.println(k);
            
        }
        
   }
    }
    