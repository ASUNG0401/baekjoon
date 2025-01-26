import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int lowsum = 0;
        int highsum = 0;
        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        StringBuilder sbaa = new StringBuilder(a);
        StringBuilder sbbb= new StringBuilder(b);

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '5' || a.charAt(i) == '6'){
                sba.setCharAt(i, '5');
            }
        }
        int lowa = Integer.parseInt(sba.toString());
        lowsum += lowa;


        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == '5' || b.charAt(i) == '6'){
                sbb.setCharAt(i, '5');

            }
        }
        int lowb = Integer.parseInt(sbb.toString());
        lowsum += lowb;

        System.out.print(lowsum);
        System.out.print(" ");

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '5' || a.charAt(i) == '6'){
                sbaa.setCharAt(i, '6');
            }
        }
        int higha = Integer.parseInt(sbaa.toString());
        highsum += higha;

        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == '5' || b.charAt(i) == '6'){
                sbbb.setCharAt(i, '6');
            }
        }
        int highb = Integer.parseInt(sbbb.toString());
        highsum += highb;

        System.out.print(highsum);

        


    
    }
}
