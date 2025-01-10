import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Stack<Character> stack = new Stack<>();
        int[] arr = new int[26];

            String word = sc.next();
            String lowerCaseText = word.toUpperCase();

            for(int i =0; i < lowerCaseText.length(); i++){
                if(65<=lowerCaseText.charAt(i) && lowerCaseText.charAt(i) <= 90){
                    arr[lowerCaseText.charAt(i) - 65]++;
                }
            }
        int max = -1;
        char cs = '?';

        for(int i =0; i<26; i++){
            if(arr[i] > max) {
                max = arr[i];
                cs = (char) (i+65);
            }else if(arr[i] == max){
                cs = '?';
            }
        }
        System.out.println(cs);
    
}   
}

