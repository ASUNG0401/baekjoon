import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            // sc.nextLine();
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for(int i =0; i < num; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                for(int j = a; j <= b; j++){
                    String temp = Integer.toString(j);
                    for(int k =0; k < temp.length(); k++){
                        if(temp.charAt(k) == '0'){
                            count++;
                        }
                    }
                }
                sb.append(count).append("\n");
                count = 0;
            }

            System.out.println(sb.toString());
    }
    }