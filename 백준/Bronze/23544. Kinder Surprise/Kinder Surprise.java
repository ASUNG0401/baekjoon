import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); 

        Set<String> uniqueHippos = new HashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueHippos.add(sc.nextLine());
        }

        System.out.println(n - uniqueHippos.size()); 
    }
}