import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 
        double[] list = new double[]{25, 10, 5, 1};
        

        for(int i = 0; i < T; i++){
            int[] list2 = new int[]{0,0,0,0};
            int j =0;
            int c = sc.nextInt();
            while(c != 0){
                if(c - list[j] >= 0){
                    c -= list[j];
                    list2[j] += 1; 
                }else{
                    j++;
                }
            }
            for( int k = 0; k < 4; k++){
                System.out.print(list2[k] + " ");
            }
        }


    }
    }
