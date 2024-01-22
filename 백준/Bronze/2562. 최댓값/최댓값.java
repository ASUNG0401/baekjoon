import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ary = new int[9]; 
        int max = 0;
        int index =0;

        for(int i=0; i < 9; i++){
            ary[i] = scanner.nextInt();
        }
//-------------------------------------------------
        for(int j =0; j<9; j++){
            int value = ary[j];
            if(value > max){
                max =value;
                index = (j+1);
            }
        }
        System.out.print(max + "\n" + index);
//-------------------------------------------------------------------
    }
}
    

