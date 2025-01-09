import java.util.Scanner;

    public class Main {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word = sc.next();

            StringBuilder sb = new StringBuilder();

            for(int i =0; i < word.length(); i++){
                if(i % 10 == 0 && i !=0){
                    sb.append("\n");
                    sb.append(word.charAt(i));
                }else{
                    sb.append(word.charAt(i));
                }
                
            }
            System.out.println(sb);
            
        }
    }
    