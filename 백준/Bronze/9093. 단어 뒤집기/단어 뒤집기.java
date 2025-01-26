import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            sc.nextLine();
            StringBuilder sb = new StringBuilder();

            for(int i =0; i < num; i++){
                String sent = sc.nextLine();
                String[] arr = sent.split(" ");
                for(int j = 0; j < arr.length; j++){
                    String temp = arr[j];
                    for(int k = temp.length()-1; k >= 0; k--){
                        sb.append(temp.charAt(k));
                    }
                    sb.append(" ");
                }
                sb.append("\n");
            }

            System.out.println(sb);
    }
    }