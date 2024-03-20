import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = 0;
        int col = 0;
        
        int[][] arr = new int[9][9];
    
        for(int i =0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++){
                int num2 = sc.nextInt();
                arr[i][j] =num2;
            }
        }

        int temp = Integer.MIN_VALUE;
        for(int i =0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++){
                if(arr[i][j] > temp){
                    temp = arr[i][j];
                    row = i+1;
                    col = j+1;
                    
    }
    
}
        }
        System.out.println(temp);
        System.out.println(row + " " + col);
    }
}
