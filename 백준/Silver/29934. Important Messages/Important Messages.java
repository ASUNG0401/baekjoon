import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // newline 처리
        
        HashSet<String> contacts = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String email = scanner.nextLine().trim();
            contacts.add(email);
        }

        int M = scanner.nextInt();
        scanner.nextLine();
        
        int highlightCount = 0;
        for (int i = 0; i < M; i++) {
            String sender = scanner.nextLine().trim();
            if (contacts.contains(sender)) {
                highlightCount++;
            }
        }

        System.out.println(highlightCount);

        scanner.close();
    }
}
