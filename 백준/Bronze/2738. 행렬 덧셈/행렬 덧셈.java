import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] Board = new int[N][M];
        int[][] Board2 = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                Board[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                Board2[i][j] = sc.nextInt();
            }
        }
     
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(Board[i][j]+Board2[i][j]+" ");
                if(j == M-1){
                    System.out.println();
                }
            
            }
        }
        
    }
    }

//-------------------------------------------------------------------



