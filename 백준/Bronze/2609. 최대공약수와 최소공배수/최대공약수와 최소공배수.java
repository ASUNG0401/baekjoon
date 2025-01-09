import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
            int num  = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(gdc(num, num2));
            System.out.println(lcm(num, num2));

        }
        static int gdc(int a, int b) { 
                if(a<b) 
                {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                while(b!=0) {
                    int r=a%b;
                    a=b;
                    b=r;
                }
                return a;
            }
            
            static int lcm(int a, int b) {
                return a*b / gdc(a,b);
            }
        }
        
    
