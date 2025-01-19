import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();

        int x = sc.nextInt(); 
        int y = sc.nextInt(); 
        int w = sc.nextInt(); 
        int h = sc.nextInt(); 

        int newf = h - y;
        int newr = w - x;

        n.add(x);
        n.add(y);
        n.add(newf);
        n.add(newr);

        Collections.sort(n);

        System.out.println(n.get(0));

        



    }
}