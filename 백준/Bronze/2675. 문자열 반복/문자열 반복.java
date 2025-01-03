import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int N = in.nextInt();

        for(int i =0; i < N; i++){
            int count = in.nextInt();
            String word = in.next();   


            for(int j =0; j < word.length(); j++){
                for (int k = 0; k < count; k++) { 
                    System.out.print(word.charAt(j));
            }

        }
        System.out.println(); 
    }
    }
}
        
       
