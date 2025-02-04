import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); 
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            Set<Integer> uniqueCategories = new HashSet<>();
            int[] categories = new int[N];
            
            for (int i = 0; i < N; i++) {
                categories[i] = sc.nextInt();
            }
            
            for (int i = 0; i < N; i++) {
                uniqueCategories.add(categories[i]);
            }
            
            int requiredProblems = 0;
            Set<Integer> solvedCategories = new HashSet<>();

            for (int i = 0; i < N; i++) {
                solvedCategories.add(categories[i]);
                requiredProblems++;
   
                if (solvedCategories.size() == uniqueCategories.size()) {
                    break;
                }
            }

            System.out.println("Case " + t + ": " + requiredProblems);
        }
        
        sc.close();
    }
}
